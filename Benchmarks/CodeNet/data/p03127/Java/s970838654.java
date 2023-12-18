import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = 0;
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			if (i == 0) {
				x = a;
			} else {
				x = gcd(x, a);
			}
			if (x == 1) {
				break;
			}
		}
		System.out.println(x);
	}
	
	static int gcd(int a, int b) {
		if (a % b == 0) {
			return b;
		} else {
			return gcd(b, a % b);
		}
	}
}
