import java.util.Scanner;
public class a018 {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long k = sc.nextLong();
		int max = 0;
		int g = 0;
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			g = gcd(g, x);
			max = Math.max(max, x);
		}
		System.out.println(k%g==0 && max >= k ? "POSSIBLE" : "IMPOSSIBLE");
	}
	static int gcd(int a, int b) {
		return b>0 ? gcd(b, a%b) : a;
	}
}