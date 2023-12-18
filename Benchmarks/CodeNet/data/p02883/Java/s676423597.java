import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		long[] a = new long[n]; for(int i = 0; i < n; i++) a[i] = sc.nextLong();
		long[] f = new long[n]; for(int i = 0; i < n; i++) f[i] = sc.nextLong();

		long l = 0; long r = 1000000000000l;

		while(r > l) {
			int use = 0;
			long c = (l+r)/2;
			for(int i = 0; i < n; i++) {
				long X = (long)Math.floor(c/f[n-i-1]);
				if(X < a[i]) {
					use += (a[i] - X);
					//a[i] = X;
				}
			}
			if(use > k) {
				l = c+1;
			}else {
				r = c;
			}
			//System.out.printf("%d %d%n", l,r);
		}

		System.out.println(l);
		sc.close();
	}
}