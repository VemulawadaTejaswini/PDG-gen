
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] A = new long[n];
		
		for(int i = 0; i < n; i++) {
			A[i] = sc.nextLong();
		}
		long Gcd = A[0];
		for(int i = 1; i < n; i++) {
			Gcd = gcd(Gcd, A[i]);
		}
		long ans = 0;
		if(n == 2) {
			ans = Math.max(A[0], A[1]);
		}else {
			ans = Gcd;
			long[] yaku = new long[n];
			yaku[0] = gcd(A[0], A[n-1]);
			for(int i = 1; i < n; i ++) {
				yaku[i] = gcd(A[i-1], A[i]);
			}
			for(int i = 0; i < n; i ++) {
				
				if(yaku[i] != Gcd) {
					if(ans != Gcd) {
						ans = Math.min(ans, yaku[i]);
					}else {
						ans = yaku[i];
					}
				}
			}
			
		}
		System.out.println(ans);
		sc.close();
	}
	private static long gcd(long m, long n) {
	    if(m < n) return gcd(n, m);
	    if(n == 0) return m;
	    return gcd(n, m % n);
	}
}
