import java.util.Scanner;

public class Main {
	static int MAX = 2000000;
	static int MOD = 1000000007;

	static long[] fac, finv, inv;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int X = Integer.parseInt(sc.next());
		int Y = Integer.parseInt(sc.next());

		sc.close();

		if(X % 3 != 0 || Y % 3 != 0) {
			System.out.println(0);
			return;
		}

		int x = X * 2 / 3 - Y / 3;
		int y = -X / 3 + Y * 2 / 3;

		fac = new long[MAX];
		finv = new long[MAX];
		inv = new long[MAX];

		COMinit();
		System.out.println(COM(x + y, x));



//		FastScanner fs = new FastScanner();
//		int N = fs.nextInt();


	}

	static void COMinit() {
	    fac[0] = fac[1] = 1;
	    finv[0] = finv[1] = 1;
	    inv[1] = 1;
	    for (int i = 2; i < MAX; i++){
	        fac[i] = fac[i - 1] * i % MOD;
	        inv[i] = MOD - inv[MOD%i] * (MOD / i) % MOD;
	        finv[i] = finv[i - 1] * inv[i] % MOD;
	    }
	}

	static long COM(int n, int k){
	    if (n < k) return 0;
	    if (n < 0 || k < 0) return 0;
	    return fac[n] * (finv[k] * finv[n - k] % MOD) % MOD;
	}


}

