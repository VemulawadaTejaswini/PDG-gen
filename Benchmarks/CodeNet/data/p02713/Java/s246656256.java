import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		long ans = 0;
		for(int i = 1; i <= K; i++) {
			for(int j = 1; j <= K; j++) {
				for(int k = 1; k <= K; k++) {
					ans += gcd(i, gcd(j, k));
				}
			}
		}
		System.out.println(ans);
	}
	
	static int gcd (int a, int b) {
		return b > 0 ? gcd(b, a % b) : a;
	}
}
