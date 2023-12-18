import java.util.*;

class Main {
	Scanner sc;
	long A, B;
	long G;
	
	Main() {
		sc = new Scanner(System.in);
	}
	
	void calc() {
		A = sc.nextLong();
		B = sc.nextLong();
		G = gcd(A,B);
		int N = (int)Math.sqrt(G);
		
		int l = -1;
		int c = 0;
		int p;
		for (p = 2; p <= N; p++) {
			if ( (G%p)==0 ) {
				G /= p;
				if (l != p) {
					c++;
					l = p;
				}
				p--;
			}
		}
		if (G >= p) c++;
		System.out.println(c+1);
	}
	
	private static final long gcd(long a, long b) {
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
	
	    return a;
	}

	public static void main(String[] args) {
		new Main().calc();
	}
}