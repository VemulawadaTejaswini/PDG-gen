import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int i = 0;
		int j = 0;
		int k = 0;
		int N = sc.nextInt();
		int Y = sc.nextInt();
		boolean result = false;

		loop: for (i = 0; i <= N; i++) {
			for (j = 0; j <= N - i; j++) {
				for (k = 0; k <= N - i - j; k++) {
					if (Y == 1000 * i + 5000 * j + 10000 * k && N == i + j + k) {
						result = true;
						break loop;
					}
				}
			}
		}

		if (result) {
			System.out.println(k + " " + j + " " + i);
		} else {
			System.out.println("-1 -1 -1");
		}
	}
}