import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		int h = 0, w = 0, t;
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= m; j++) {
				if (i > 0 && j > 0) {
					t = n * i + m * j - 2 * i * j;
				} else {
					t = n * i + m * j;
				}
				if (t == k) {
					System.out.println("Yes");
					return;
				}
			}
		}
		System.out.println("No");
	}
}