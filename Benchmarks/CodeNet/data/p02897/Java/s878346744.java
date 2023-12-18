import java.math.BigDecimal;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int num = sc.nextInt();
			int n = num / 2;
			BigDecimal ans = new BigDecimal(num - n).divide(new BigDecimal(num)).setScale(10, 0);
			System.out.println(ans);
		}
	}
}