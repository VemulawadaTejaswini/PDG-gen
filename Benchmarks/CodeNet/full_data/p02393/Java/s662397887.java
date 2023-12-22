fun main(args: Array<String>){
  val scn=Scanner(System.in)
  println(generateSequence{scn.nextInt()}.take(3).sorted().joinToString(" "))
}

