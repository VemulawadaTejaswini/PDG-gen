import java.util.*;

public class Main {
	
	public static long k;
	public static long c;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		long kk = scan.nextLong();
		k = kk;
		long[] A = new long[n];
		long[] B = new long[m];
		long[] DP = new long[Math.max(n, m)];
		for(int i = 0; i < n; i++) {
			A[i] = scan.nextLong();
		}
		for(int i = 0; i < m; i++) {
			B[i] = scan.nextLong();
		}
		int max = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				c = 0;
				k = kk;
				int count = 0;
				if(count(A, i)) {
					count += c;
				} else {
					continue;
				}
				k = kk - count;
				if(count(B, j)) {
					count += c;
					if(max < i+j + 2) {
						max = i+j+2;
					}
				}
			}
		}
		System.out.println(max);
	}
	
	public static boolean count(long[] C, int depth) {
		int count = 0;
		for(int i = 0; i <= depth; i++) {
			count += C[i];
			if(count > k) {
				return false;
			}
		}
		c = count;
		return true;
	}

}
