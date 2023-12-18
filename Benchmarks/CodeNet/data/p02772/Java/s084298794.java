object Main extends App {
  val n = io.StdIn.readLine()
  val line = io.StdIn.readLine().split(" ").map(_.toInt)
  val odd = line.filter(_%2 == 0 ).toSeq
  val ans = line.filter(a => a%2 == 0 && (a%5 == 0 || a%3==0) && a%15!=0).toSeq
  
  if(odd.nonEmpty && odd == ans) println("APPROVED")
  else println("DENIED")
 
//  println(s"n ${n} odd ${odd}")
}
