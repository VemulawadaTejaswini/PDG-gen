import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean[] p = new boolean[50001];
		for (int i = 0; i <= 50000; i++) {
			p[i] = true;
		}
		p[0] = p[1] = false;
		for (int i = 2; i <= 224; i++) {
			for (int j = i * 2; j <= 50000; j += i) {
				p[j] = false;
			}
		}
		while (sc.hasNextInt()) {
			int n = sc.nextInt();
			if (n == 0)
				break;
			if (n % 2 == 1) {
				System.out.println(0);
				continue;
			}
			int c = 0;
			for (int i = 2; i <= n / 2; i++) {
				if (p[i] && p[n - i])
					c++;
			}
			System.out.println(c);
		}
	}
}