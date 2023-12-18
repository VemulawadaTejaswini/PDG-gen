fun main(args: Array<String>){
    val num = readLine()!!.toInt()
    if(num % 2 == 0) {
        val a = num / 2
        println(a*a)
    }
    else{
        val b = num / 2
        val c = b + 1
        println(b*c)
    }
}
