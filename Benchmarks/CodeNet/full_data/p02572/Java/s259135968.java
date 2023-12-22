import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int[] b = new int[a];

		for (int i = 0; i < a; i++) {
			b[i] = sc.nextInt();
		}

		BigDecimal answer = new BigDecimal("0");

		for (int i = 0; i < a; i++) {
			BigDecimal big_a = new BigDecimal(b[i]);
			BigDecimal big_b = new BigDecimal("0");
			for (int j = i + 1; j < a; j++) {
				big_b = big_b.add(new BigDecimal(b[j]));
			}
			BigDecimal big_a_b = big_a.multiply(big_b);
			answer = answer.add(big_a_b);
		}

		answer = answer.remainder(new BigDecimal("1000000007"));

		System.out.println(answer);
	}
}
