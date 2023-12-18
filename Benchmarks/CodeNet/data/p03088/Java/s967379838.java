object Main{
	def main(args:Array[String]){
		val n = new java.util.Scanner(System.in).nextInt
		val a = Array.fill(n + 1,4,4,4)(0L)
		val A = 0
		val C = 1
		val G = 2
		val T = 3
		val mod = 1000000007
		a(0)(T)(T)(T) = 1
		for(i <- 1 to n) {
			for(j <- 0 to 3) {
				for(k <- 0 to 3) {
					for(l <- 0 to 3) {
						for(m <- 0 to 3) {
							if(!(k == A && l == G && m == C ||
									k == G && l == A && m == C ||
									k == A && l == C && m == G ||

									j == A && k == G && m == C ||
									j == A && l == G && m == C
									)) {
								a(i)(k)(l)(m) = (a(i)(k)(l)(m) + a(i - 1)(j)(k)(l)) % mod
							}
						}
					}
				}
			}
		}
		println(a(n).flatten.flatten.sum % mod)
	}
}
