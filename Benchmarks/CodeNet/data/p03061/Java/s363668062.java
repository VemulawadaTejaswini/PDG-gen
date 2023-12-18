package kyopro;


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
			int left = L(i, A);
			int right = R(i, A);
			System.out.println(left +" "+  right);
			int tmp = gcd(left, right);
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
	private static int L(final int i, final int A[]) {
		if(i == 0) {
			return 0;
		}else {
			return gcd(L(i-1, A), A[i]);
		}
		
	}
	private static int R(final int i, final int A[]) {
		if(i == A.length-1) {
			return 0;
		}else {
			return gcd(R(i+1, A), A[i]);
		}
		
	}
}
