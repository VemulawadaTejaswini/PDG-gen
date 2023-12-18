import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		long[] a = new long[n]; for(int i = 0; i < n; i++) a[i] = Long.parseLong(sc.next());
		long[] f = new long[n]; for(int i = 0; i < n; i++) f[i] = Long.parseLong(sc.next());
		long l = 0;
		long r = 1000000000000l;

		Arrays.parallelSort(a);
		Arrays.parallelSort(f);

		try {
		while(r > l) {
			long use = 0;
			long c = (l+r)/2;
			for(int i = 0; i < n; i++) {
				long X = c/f[n-i-1];
				if(X < a[i]) use += (a[i] - X);
			}
			if(use > k) l = c + 1;
			else r = c;
		}
		}catch (Exception e) {
			System.out.println(-1);
		}

		System.out.println(l);
		sc.close();
	}
}