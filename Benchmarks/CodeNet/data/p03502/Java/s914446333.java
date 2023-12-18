import scala.io.StdIn

object Main extends App {
  def f(x:Int,t:Int):Int = {
    if(x == 0) t
    else f(x/10, t + (x % 10))
  }

  val n = StdIn.readLine.toInt

  val ans = if(n % f(n,0) == 0) "Yes" else "No"
  println(ans)
}