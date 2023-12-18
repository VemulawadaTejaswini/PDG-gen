import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.PrintWriter

object Solve {

  private val br = BufferedReader(InputStreamReader(System.`in`))
  private val out = PrintWriter(System.out)

  fun solve() {

    val n = br.readLine()!!.toInt()

    var ans = -1

    for (i in 1..5000){
      if(i * 108 / 100 == n){
        ans = i
      }
    }

    out.println(if(ans == -1) ":(" else ans)
    out.flush()
  }
}

fun main(args: Array<String>){
  Solve.solve()
}