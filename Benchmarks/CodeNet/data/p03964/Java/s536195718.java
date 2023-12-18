import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[]T = new long[N];
		long[]A = new long[N];
		for(int i = 0; i < N; i++) {
			T[i] = sc.nextLong();
			A[i] = sc.nextLong();
		}
		sc.close();
		long k = gcd(T[0], A[0]);
		long x = T[0];
		long y = A[0];
		for(int i = 1; i < N; i++) {
			long n1 = T[i];
			long n2 = A[i];
			long k1 = T[i] - x;
			long k2 = A[i] - y;
			if(k1 == 0 && k2 == 0) continue;
			long m = 1;
			long l = 0;
			long r = Long.MAX_VALUE;
			long mid = 0;
			while(r - l > 1) {
				mid = (r + l) / 2;
				k1 = n1 * mid - x;
				k2 = n2 * mid - y;
				if(k1 == 0 && k2 == 0) {
					//System.out.println("a");
					break;
				}
				if(k1 >= 0 && k2 >= 0) {
					r = mid;
				}else {
					l = mid;
				}
			}
			k1 = T[i] * mid - x;
			k2 = A[i] * mid - y;
			if(k1 < 0 || k2 < 0) {
				mid ++;
			}
			k1 = T[i] * mid - x;
			k2 = A[i] * mid - y;
			if(k1 < 0 || k2 < 0) {
				mid ++;
			}
			k1 = T[i] * mid - x;
			k2 = A[i] * mid - y;
			x += k1;
			y += k2;
			//System.out.printf("%d %d %d %d %d \n", x, y, k1, k2, mid);
		}
		long ans = x + y;
		System.out.println(ans);
	}
	static long gcd(long n, long m) {
		if(n > m) {
			return gcd(m, n);
		}
		long k = m % n;
		if(k == 0) {
			return n;
		}else {
			return gcd(n, k);
		}
	}
}