fun main(args:Array<String>){
  var (p,q,r) = readLine()!!.split(" ").map(String::toInt)
  var arr:List<Int> = listOf(p,q,r).sorted()
  println(arr[0]+arr[1])
}