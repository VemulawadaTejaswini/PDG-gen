import java.math.BigDecimal;
		import java.util.Scanner;

public class Main {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int A = scanner.nextInt(), B = scanner.nextInt(), C = scanner.nextInt();
		double D = C / 2.0;
		if (D == 0) {
			System.out.println(0);
		} else {
			BigDecimal x = BigDecimal.valueOf(A).multiply(BigDecimal.valueOf(B));
			BigDecimal a = x.multiply(BigDecimal.valueOf(Math.ceil(D)));
			BigDecimal b = x.multiply(BigDecimal.valueOf(Math.floor(D)));
			System.out.println(a.subtract(b).abs().toBigInteger().toString());
		}
	}
}
