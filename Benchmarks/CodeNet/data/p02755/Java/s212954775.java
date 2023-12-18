import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 数値
		long a = sc.nextInt();
		long b = sc.nextInt();

		boolean isa = false;
		boolean isb = false;
		boolean nai = false;

		for (int i = 1; i <= 1000; i++) {
			if ((int) (i * 0.08) == a) {
				isa = true;
			}
			if ((int) (i * 0.1) == b) {
				isb = true;
			}

			if (isa && isb) {
				System.out.println(i);
				break;
			}
			if (i == 1000) {
				System.out.println(-1);
			}
			isa = false;
			isb = false;
		}

	}
}
