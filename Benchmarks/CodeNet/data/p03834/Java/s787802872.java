import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s: String = sc.next()
    for (i in 0 until s.length) {
        if (s[i] == ',') {
            print(' ')
        } else {
            print(s[i])
        }
    }
    println()
}
