import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		for (;;) {
			int n = s.nextInt(), a = s.nextInt(), b = s.nextInt(), c = s
					.nextInt(), x = s.nextInt();
			if (n < 1) {
				break;
			}

			int rs[] = new int[n];
			for (int i = 0; i < n; ++i) {
				rs[i] = s.nextInt();
			}

			int count = 0, i = 0;
			for (;count <= 10000; ++count) {
				int r = rs[i];
				if (r == x) {
					++i;
				}
				x = (a * x + b) % c;
				if (i == n) {
					break;
				}
			}
			System.out.println(count > 10000 ? -1 : count);
		}
	}
}