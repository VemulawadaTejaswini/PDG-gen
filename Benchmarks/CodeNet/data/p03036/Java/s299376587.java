import scala.io.{StdIn => in}

object Main extends App {
  val out = new java.io.PrintWriter(System.out)
  val Array(r, d, x) = in.readLine.split(" ").map(_.toLong)
  var xi = x
  (1 to 10).foreach { i =>
    val v = r * xi - d
    out.println(v)
    xi = v 
  }
  out.flush
}