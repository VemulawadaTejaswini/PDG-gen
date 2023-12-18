import java.util.Scanner;

fun main (args : Array<String>) {
  val input = Scanner(System.`in`)
  
  while (input.hasNext()) {
    val S = input.next()
    var countA = 0
    var countB = 0
    
    for (c in S) {
      if (c == 'A') {
        ++countA
      }
      
      if (c == 'B') {
        ++countB
      }
    }
    
    if (countA == 3 || countB == 3) {
      println("No")
    } else {
      println("Yes")
    }
  }
}