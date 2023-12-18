import scala.io.{StdIn => in}

object Main extends App {
  val Array(a, b) = in.readLine.split(" ").map(_.toInt)
  val ans = a match {
    case x if x <= 5 => 0
    case x if x <=12 => b / 2
    case _ => b
  }
  println(ans)
}