import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		long c = 0;
		for (int a = Math.max(k, 1); a <= n; a++)
			c += n - a;
		for (int b = k + 1; b <= n; b++) {
			for (int d = k; d <= n; d += b) {
				c += Math.max(0, Math.min(n, 2 * b) - d + 1);
				if (k == 0)
					break;
			}
		}
		System.out.println(c);
	}
}
