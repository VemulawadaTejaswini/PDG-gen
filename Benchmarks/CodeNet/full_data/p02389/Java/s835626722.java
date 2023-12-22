import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)
  val a = sc.nextInt()
  val b = sc.nextInt()
  val c = a * b
  val d = ( a + b ) * 2
  println(s"$c $d")
}