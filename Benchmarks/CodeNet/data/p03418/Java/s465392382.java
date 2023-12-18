import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		long c = 0;
		for (int a = Math.max(k, 1); a <= n; a++)
			for (int b = a + 1; b <= n; b++)
				c++;
		for (int b = k + 1; b <= n; b++)
			for (int a = b + k; a <= n; a++) {
				//if (a % b >= k)
					c++;
				if (a % b == b - 1)
					a += k;
			}
		System.out.println(c);
	}
}