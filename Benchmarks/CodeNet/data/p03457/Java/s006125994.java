import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int t[] = new int[n + 1];
			int x[] = new int[n + 1];
			int y[] = new int[n + 1];
			t[0] = 0;
			x[0] = 0;
			y[0] = 0;
			for (int i = 1; i < n + 1; i++) {
				t[i] = sc.nextInt();
				x[i] = sc.nextInt();
				y[i] = sc.nextInt();
			}

			String result = "Yes";
			for (int i = 0; i < n; i++) {
				if (t[i + 1] - t[i] >= Math.abs(x[i + 1] - x[i]) + Math.abs(y[i + 1] - y[i]) && 
						(t[i + 1] - t[i]) % 2 == (Math.abs(x[i + 1] - x[i]) + Math.abs(y[i + 1] - y[i])) % 2) {
				} else {
					result = "No";
					break;
				}

				System.out.println(result);
			}

		}

	}

}