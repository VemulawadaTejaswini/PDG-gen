import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		int max = 0;
		int gcd = 0;
		for (int i = 0; i < n; i++) {
			int a = Integer.parseInt(sc.next());
			max = Math.max(max, a);
			gcd = gcd(gcd, a);
		}
		if (k <= max && k % gcd == 0)
			System.out.println("POSSIBLE");
		else
			System.out.println("IMPOSSIBLE");
	}
	static int gcd(int a, int b) {
		if(b == 0) return a;
		return gcd(b, a%b);
	}
}