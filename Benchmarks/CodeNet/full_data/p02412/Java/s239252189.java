import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder out = new StringBuilder();
		while (true) {
			int n = sc.nextInt();
			int x = sc.nextInt();
			if (n == 0 && x == 0)
				break;
			int cnt = 0;
			for (int fi = 1; fi <= n - 2; ++fi) {
				for (int si = fi + 1; si <= n - 1; ++si) {
					for (int ti = si + 1; ti <= n; ++ti) {
						if (fi + si + ti == x)
							++cnt;
					}
				}
			}
			out.append(cnt + "\n");
		}
		System.out.print(out);
	}
}
