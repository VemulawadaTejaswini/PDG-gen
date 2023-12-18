import java.math.BigDecimal;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int size = sc.nextInt();
			long num = 1;
			long divisor = 0;
			int[] array = new int[size];
			for (int i = 0; i < size; i++) {
				int p = sc.nextInt();
				num *= p;
				array[i] = p;
			}
			for (int i = 0; i < size; i++) {
				divisor += num / array[i];
			}
			BigDecimal ans = new BigDecimal(num).setScale(10).divide(new BigDecimal(divisor), BigDecimal.ROUND_HALF_UP);
			System.out.println(ans);
		}
	}
}