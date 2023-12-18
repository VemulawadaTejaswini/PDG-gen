import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		long[] a = new long[n]; for(int i = 0; i < n; i++) a[i] = sc.nextLong();
		long[] f = new long[n]; for(int i = 0; i < n; i++) f[i] = sc.nextLong();
		long l = -1;
		long r = 1000000000000l;

		Arrays.parallelSort(a);
		Arrays.parallelSort(f);

		while(r - l <= 1) {
			long use = 0;
			long c = (l+r)/2;
			for(int i = 0; i < n; i++) {
				long X = (c/f[n-i-1]);
				if(X < a[i]) use += (a[i] - X);
			}
			if(use > k) l = c;
			else r = c;
		}

		System.out.println(r);
		sc.close();
	}
}