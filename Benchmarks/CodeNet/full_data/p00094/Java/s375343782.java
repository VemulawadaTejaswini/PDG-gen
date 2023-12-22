public class Main {

	public static void main(String[] args) {
		double a = new java.util.Scanner(System.in).nextDouble();
		double b = new java.util.Scanner(System.in).nextDouble();
		double c = 3.305785;
		double ans = a * b / c;

//		BigDecimal x = new BigDecimal(ans);
//		x = x.setScale(6, BigDecimal.ROUND_HALF_UP);

		System.out.println(ans);

	}

}