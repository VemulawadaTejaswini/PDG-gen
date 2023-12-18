import java.util.*;

class Main {
	Scanner sc;
	long r1, c1, r2, c2;
	int[] m;
	static final int MOD = 1_000_000_007;
	
	private void calc() {
		sc = new Scanner(System.in);
		r1 = sc.nextInt();
		c1 = sc.nextInt();
		r2 = sc.nextInt();
		c2 = sc.nextInt();
		
		if (c2-c1 > r2-r1) {
			long t = c1; c1 = r1; r1 = t;
			t = c2; c2 = r2; r2 = t;
		}
		
		long nCr = 1;
		for (int i = 1; i <= r1; i++)
			nCr = nCr*(i+c1)%MOD * inv(i) % MOD;
		long top = nCr;
		long left = nCr;
		long s = nCr;
		long ds = nCr;
		
		for (long x = 1; x < r2-r1+c2-c1+1; x++) {
			long i = (2*ds - top - left+2*MOD)%MOD;
			ds = 0;
			left = left * ((c1 + r1 + x)%MOD )%MOD;
			if (x < c2-c1+1) {
				left = left * inv(c1 + x) %MOD;
				ds += left;
			} else {
				left = left * inv(r1 + x-c2+c1) %MOD;
			}
			top = top * ((c1 + r1 + x)%MOD )%MOD;
			if (x < r2-r1+1) {
				top = top * inv(r1 + x) %MOD;
				ds += top;
			} else {
				top = top * inv(c1 + x-r2+r1) %MOD;
			}
			ds = (ds + i)%MOD;
			s = (s + ds)%MOD;
		}
		
		System.out.println(s);
	}
	
	static final long inv(long a) {
		long b = MOD;
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
