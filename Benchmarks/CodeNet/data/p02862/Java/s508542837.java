import java.util.*;

class Main {
	Scanner sc;
	int M = 1000_000_000+7;
	void calc() {
		sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		if ( (X+Y)%3 != 0 ) {
			System.out.println(0);
			return;
		}
		int N = (X+Y)/3;
		int a = X-N;
		int b = Y-N;
		
		long u = 1;
		for (int i = a+b; i > a; i--) u = (u * i) % M;
		long l = 1;
		for (int i = b; i >= 1; i--) l = (l * i) % M;
		
		int inv = extgcd((int)l, M)[1];
		
		System.out.println((u * inv)%M);
	}

	/**
	 * 拡張ユークリッド互除法
	 * ax+by=gcd(a,b) となる gcd,x,y を求める。
	 */
	static final int[] extgcd(int a, int b) {
		int x0 = 1, x1 = 0;
		int y0 = 0, y1 = 1;
	
		while (b != 0) {
			int q = a / b;
			int r = a % b;
			int x2 = x0 - q * x1;
			int y2 = y0 - q * y1;
	
			a = b; b = r;
			x0 = x1; x1 = x2;
			y0 = y1; y1 = y2;
		}
	
	    return new int[]{a, x0, y0};
	}
	
	public static void main(String[] args) {
		new Main().calc();
	}
}