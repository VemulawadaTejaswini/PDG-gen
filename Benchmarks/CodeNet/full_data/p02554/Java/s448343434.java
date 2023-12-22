public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		BigDecimal N = new BigDecimal(n)
;		long m = (long) (Math.pow(10, 9)+7);

		BigDecimal[] ans = N.multiply(N.subtract(BigDecimal.ONE))
		.multiply(BigDecimal.TEN.pow(n-2)).divideAndRemainder(new BigDecimal(m));

		System.out.println(ans[1]);
		scan.close();
	}

}