import scala.io.StdIn

object Main extends App {
  val k = StdIn.readInt()
  val (a, b) = readIntPair
  val res = (a to b).exists(_ % k == 0)
  println(if (res) "OK" else "NG")

  def readIntPair: (Int, Int) = {
    val Array(x, y) = StdIn.readLine().split(" ").map(_.toInt)
    (x, y)
  }
}