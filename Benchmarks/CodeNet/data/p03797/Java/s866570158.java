import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		int ans = n;

		if(n * 2 != m) {
			if(n * 2 > m) {
				m = n - m / 2;
			}
			else if(n * 2 < m) {
				m = m - 2 * n;
			}

			if(n * 2 != m) {
				ans += m / 4;
			}
		}

		System.out.println(ans);
	}
}
