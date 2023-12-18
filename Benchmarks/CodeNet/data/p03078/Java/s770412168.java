fun main(args :Array<String>) {
    val (x, y, z, k) = readIntegerList()
    val aList = readLongList()
    val bList = readLongList()
    val cList = readLongList()

    val abList = ArrayList<Long>(x * y)
    for (a in aList) {
        abList.addAll(bList.map { it + a })
    }
    val abc = abList.sortedDescending().subList(0, Math.min(k, abList.size))

    val acList = ArrayList<Long>(abc.size * z)
    for (ab in abc) {
        acList.addAll(cList.map { it + ab })
    }
    for (ans in acList.sortedDescending().subList(0, Math.min(k, acList.size))) {
        println(ans)
    }
}

fun readInteger() = readLine()!!.toInt()
fun readStringList() = readLine()!!.split(" ")
fun readIntegerList() = readStringList().map(String::toInt)
fun readLongList() = readStringList().map(String::toLong)
