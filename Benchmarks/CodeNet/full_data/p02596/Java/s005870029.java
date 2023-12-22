import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)) {
			String data = scanner.nextLine();

			int K = Integer.parseInt(data);
			BigDecimal bdK = BigDecimal.valueOf(K);

			int ans = -1;
			if (K % 2 == 0) {
				System.out.println(ans);
				return;
			}

			for (int i = 1; i <= Integer.MAX_VALUE; i++) {
				String num = getSevenString(i);
				BigDecimal bd = new BigDecimal(num);
				System.out.println("BigDecimal bd = " + bd.toPlainString());
				if (bd.remainder(bdK).compareTo(BigDecimal.ZERO) == 0) {
					ans = i;
					break;
				}
			}
			System.out.println(ans);
		}
	}

	private static String getSevenString(int num) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < num; i++) {
			sb.append("7");
		}
		return sb.toString();
	}
}