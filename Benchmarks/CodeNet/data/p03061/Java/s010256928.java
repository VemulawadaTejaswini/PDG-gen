
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] A = new int[n];

		for(int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
		}
		int ans = 0;
		for(int i = 0; i < n; i++) {
			int L = 0;
			int R = 0;
			for(int j = 0; j < i; j++) {
				L = gcd(L, A[j]);
			}
			for(int j = i+1; j < n; j++) {
				R = gcd(R, A[j]);
			}
			int tmp = gcd(L,R);
			ans = Math.max(ans, tmp);
		}
		System.out.println(ans);
		sc.close();
	}
	private static int gcd(int m, int n) {
	    if(m < n) return gcd(n, m);
	    if(n == 0) return m;
	    return gcd(n, m % n);
	}
}
