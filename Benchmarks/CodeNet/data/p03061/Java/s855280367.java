import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		long[] map = new long[N];
		for (int i = 0; i < N; i++) {
			map[i] = sc.nextLong();
		}
		
		long[] l = new long[N];
		l[0] = map[0];
		for (int i = 1; i < N; i++) {
			l[i] = gcd(l[i-1], map[i]);
		}
		
		long[] r = new long[N];
		r[N-1] = map[N-1];
		for (int i = N-2; 0 <= i; i--) {
			r[i] = gcd(r[i+1], map[i]);
		}
		
		
		long ans = 0;
		for (int i = 0; i < N; i++) {
			if (i == 0) {
				ans = Math.max(ans, r[i+1]);
			} else if (i == N-1) {
				ans = Math.max(ans, l[i-1]);
			} else {
				ans = Math.max(ans, gcd(l[i-1], r[i+1]));
			}
		}
		
		
		System.out.println(ans);
		
	}
	
	
	static long gcd(long x, long y) {
		long tmp;
        while ((tmp = x % y) != 0) {
            x = y;
            y = tmp;
        }
        return y;
	}
	
}

