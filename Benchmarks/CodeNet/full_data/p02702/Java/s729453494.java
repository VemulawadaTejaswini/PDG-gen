import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		BigDecimal rem = new BigDecimal("2019");
		int count = 0;
		for (int i = 0; i <= S.length() - 5; i++) {
			for (int j = i + 5; j <= S.length(); j++) {
				BigDecimal subS = new BigDecimal(S.substring(i, j));
				if (subS.remainder(rem) == BigDecimal.ZERO) {
					System.out.println(subS);
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
