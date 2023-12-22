import scala.io.StdIn.{readLine,readInt}
 
object Main {
 
  def main(args: Array[String]) = {
    val n = readInt
    val rooms = Array.ofDim[Int](4,3,10)
 
    (1 to n) foreach { _ =>
      val v = readLine.split(" ").map(_.toInt)
      rooms(v(0)-1)(v(1)-1)(v(2)-1) += v(3)
    }
 
    for(b <- 0 to 3) {
      for(f <- 0 to 2) {
        for(r <- 0 to 9) {
          print(" "+rooms(b)(f)(r))
        }
        println()
      }
      if(b!=3) {
        println("####################")
      }
    }
  }
}
