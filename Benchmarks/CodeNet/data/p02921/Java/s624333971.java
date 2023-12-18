fun main(args: Array<String>) {
    val S = readLine()!!.split("")
    val T = readLine()!!.split("")

    var cnt = 0
    for (i in 1..3) {
        if (S[i] == T[i]) {
            cnt++
        }
    }
    println(cnt)
}