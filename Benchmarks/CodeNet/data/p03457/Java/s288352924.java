
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// point
		int N = sc.nextInt();
		String ans = "No";
		int[] t = new int[N + 1];
		int[] x = new int[N + 1];
		int[] y = new int[N + 1];

		t[0] = 0;
		x[0] = 0;
		y[0] = 0;

		for (int i = 1; i < N + 1; i++) {
			t[i] = sc.nextInt();
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}

		for (int i = 0; i < N; i++) {
			ans = "No";
			int dift = t[i + 1] - t[i];
			loop : for (int a = 0; a <= dift; a++) {
				for (int b = 0; b <= (dift - a); b++) {
					for (int c = 0; c <= (dift - a - b); c++) {
						for (int d = 0; d <= (dift - a - b - c); d++) {
							if (x[i + 1] == x[i] + a - b && y[i + 1] == y[i] + c - d && dift == a + b + c + d) {
								ans = "Yes";
								break loop;
							}
						}
					}
				}
			}
			if (ans.equals("No")) {
				break;
			}
		}
		System.out.println(ans);
		sc.close();
	}
}