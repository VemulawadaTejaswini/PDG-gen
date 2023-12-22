import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		BigDecimal ans = sc.nextBigDecimal();

		for(int i = 1; i < n; i++) {

			ans = ans.multiply(sc.nextBigDecimal());

		}

		if(ans.compareTo(new BigDecimal("1000000000000000000")) > 0) {
			ans = new BigDecimal("-1");
		}


		System.out.println(ans);

		sc.close();
	}

}