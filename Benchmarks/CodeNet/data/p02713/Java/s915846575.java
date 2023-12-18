import java.util.*;
public class Main {
	
	public static int gcd(int a, int b) {
		return b == 0 ? a: gcd(b, a % b);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int ans = 0;
		for(int i = 1; i <= K; i++) {
			for(int j = 1; j <= K; j++) {
				int x = gcd(i, j);
				for(int k = 1; k <= K; k++) {
					ans += gcd(x, k);
				}
			}
		}
		System.out.println(ans);
	}

}