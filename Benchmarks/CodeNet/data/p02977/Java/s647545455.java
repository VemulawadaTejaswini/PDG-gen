import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		br.close();

		int a = 0;
		for (int i = 0; i < 19; i++) {
			a = 1 << i;
			if (n == a) {
				System.out.println("No");
				return;
			}
			if (n < a) {
				a /= 2;
				break;
			}
		}

		System.out.println("Yes");
		System.out.println("1 2");
		System.out.println("2 3");
		System.out.println("3 " + (n + 1));
		System.out.println((n + 1) + " " + (n + 2));
		System.out.println((n + 2) + " " + (n + 3));

		int m = n;
		if (m % 2 == 0) {
			m--;
		}
		for (int i = 4; i < m; i += 2) {
			System.out.println((n + 1) + " " + i);
			System.out.println(i + " " + (i + 1));
			System.out.println((n + 1) + " " + (n + i + 1));
			System.out.println((n + i + 1) + " " + (n + i));
		}

		if (m != n) {
			System.out.println(n + " " + a);
			int b = n - a + 1;
			if (b > 3 && b % 2 == 1) {
				b += n;
			}
			System.out.println(n * 2 + " " + b);
		}
	}
}
