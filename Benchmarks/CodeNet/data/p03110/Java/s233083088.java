import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		BigDecimal[] bd = new BigDecimal[n];
		String[] s = new String[n];
		BigDecimal rate = new BigDecimal("380000");
		for (int i = 0; i < n; i++) {
			bd[i] = new BigDecimal(sc.next());
			s[i] = sc.next();
			if ("BTC".equals(s[i])) {
				bd[i] = bd[i].multiply(rate);
			}
		}
		sc.close();

		BigDecimal sum = BigDecimal.ZERO;
		for (int i = 0; i < n; i++) {
			sum = sum.add(bd[i]);
		}
		System.out.println(sum.toString());
	}
}
