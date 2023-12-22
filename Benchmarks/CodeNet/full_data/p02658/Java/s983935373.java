import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		BigDecimal A = BigDecimal.ONE;
		for (int i = 0; i < N; i++) {
			BigDecimal a = new BigDecimal(sc.next());
			A = A.multiply(a);
		}
		if (A.compareTo(new BigDecimal("1000000000000000000")) == 1) {
			System.out.println("-1");
			return;
		}
		System.out.println(A);
	}

}
