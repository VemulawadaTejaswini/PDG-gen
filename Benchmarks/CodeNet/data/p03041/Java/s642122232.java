private fun readLn() = readLine()!! // string line
private fun readInt() = readLn().toInt() // single int
private fun readStrings() = readLn().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints

fun main() {
    val n =  readInt()

    for (i in 1 ..n){
        val s = readLn()
        val a = s.toList().sorted().joinToString(separator = "")
        val b = s.toList().sorted().reversed().joinToString(separator = "")
        if (a == b){
            println(-1)
        }else {
            println(a)
        }
    }
}