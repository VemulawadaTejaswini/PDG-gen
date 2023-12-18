import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int M = sc.nextInt();
			int D = sc.nextInt();
			if (D < 22) {
				System.out.println(0);
				return;
			}
			int count = 0;
			for (int i = 22; i <= D; i++) {
				int d2 = i / 10;
				int d1 = i % 10;
				if (d1 < 2) {
					continue;
				}
				if (d1 * d2 <= M) {
					count++;
				}
			}
			System.out.print(count);
		}
	}
}