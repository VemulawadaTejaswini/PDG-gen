import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();

		long ans = 0;
		for(int i=1; i<=N; i++) {
			for(int j=1; j<=N; j++) {
				long gcdAB = gcd(i, j);
				for(int k=1; k<=N; k++) {
					ans += gcd(gcdAB, k);
				}
			}
		}

		System.out.println(ans);
		sc.close();
	}
	
	static long gcd(long a, long b) {
		return b==0 ? a : gcd(b, a%b);
	}
}
