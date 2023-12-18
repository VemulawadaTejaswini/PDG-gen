import java.util.*;
import java.util.stream.*;

class Main {
	Scanner sc;
	int N, P;
	String S;
	long[] c;
	
	void calc() {
		sc = new Scanner(System.in);
		N = sc.nextInt();
		P = sc.nextInt();
		S = sc.next();
		c = new long[P];
		long q = inv(10, P);
		long qq = 1;
		c[0] = 1;
		long s = 0;
		
		for (int i = 0; i < N; i++) {
			long a = S.charAt(i) - '0';
			a = (a*qq)%P;
			qq = (qq*q)%P;
			s = (s+a)%P;
			c[(int)s]++;
		}
		long ans = 0;
		for (int i = 0; i < P; i++)
			ans = ans + c[i]*(c[i]-1)/2;
		System.out.println(ans);
	}
	
	static final long inv(long a, long mod) {
		long b = mod;
		long aa = a, bb = b;
		long x0 = 1, x1 = 0;
		long y0 = 0, y1 = 1;
	
		while (b != 0) {
			long q = a / b;
			long r = a % b;
			long x2 = x0 - q * x1;
			long y2 = y0 - q * y1;
	
			a = b; b = r;
			x0 = x1; x1 = x2;
			y0 = y1; y1 = y2;
		}
		if (bb > 0 && x0 < 0) {
			long n = -x0/bb;
			if (-x0%bb != 0) n++;
			x0 += n*bb; y0 -= n*aa;
		}
	    return x0;
	}
	
	public static void main(String[] args) {
		new Main().calc();
	}
}
