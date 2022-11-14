// Name of the project
name := "ScalaFX Hello World"

// Project version
version := "9.0.0"

// Version of Scala used by the project
scalaVersion := "2.13.10"

// Add dependency on ScalaFX library
// https://mvnrepository.com/artifact/org.scalafx/scalafx
libraryDependencies += "org.scalafx" %% "scalafx" % "19.0.0-R30"


// Fork a new JVM for 'run' and 'test:run', to avoid JavaFX double initialization problems
fork := true
