import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a: Int = sc.nextInt()
    val b: Int = sc.nextInt()
    val c: Int = sc.nextInt()
    val d: Int = sc.nextInt()
    if (a * b >= c * d) {
        print(a * b)
    } else if (a * b < c * d) {
        print(c * d)
    }
}