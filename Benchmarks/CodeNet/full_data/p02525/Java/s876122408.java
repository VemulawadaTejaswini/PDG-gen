import java.util.Scanner;
import java.math.BigDecimal;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while (true) {
			int n = s.nextInt();
			if (n == 0) {
				break;
			}
			int[] scores = new int[n];
			for (int i = 0; i < scores.length; i++) {
				scores[i] = s.nextInt();
			}
			double a = 0;
			for (int k = 0; k < scores.length; k++) {
				a = a + (scores[k] / scores.length);
			}
			double v = 0;
			for (int l = 0; l < scores.length; l++) {
				v = v + Math.pow(scores[l] - a, 2) / scores.length;
			}
			BigDecimal bi = new BigDecimal(String.valueOf(Math.sqrt(v))) ;
			double v1 = bi.setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
			System.out.println(v1);
		}
	}
}