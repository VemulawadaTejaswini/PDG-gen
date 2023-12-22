import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, x;
		while (true) {
			n = sc.nextInt();
			x = sc.nextInt();
			if (n == 0 && x == 0) {
				break;
			}
			int count = 0;
			for (int i = 1; i <= n; i++) {
				for (int j = i + 1; j <= n; j++) {
					for (int k = j; k <= n; k++) {
						if (x == i + j + k && i != j && i != k && j != k) {
							count++;
						}
					}
				}
			}
			System.out.println(count);
		}
	}
}
