
import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)

  val n = sc.nextInt
  val s, t = sc.next
  val ans = (0 until n)
    .map(i => (i, s.substring(i), t.substring(0, n - i)))
    .find(t => t._2 == t._3)
    .map(n + _._1)
    .getOrElse(2 * n)
  println(ans)
}
