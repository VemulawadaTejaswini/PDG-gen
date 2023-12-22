import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){

			long S = scan.nextLong();

			long mod = (long)1e9+7;

			COMinit();


			if(S<3) {
				System.out.println(0);
				return;
			}

			long goukei = 0;
			long k = S/3;

			for(int i = 1;i<=k;i++) {
				int amari =  (int)(S-3*i);
				for(int j = 1;j<=i;j++) {
					if(j>amari)break;
					long go = (COM(i,j)*COM(amari-1,j-1))%mod;
					goukei =  (goukei+go)%mod;
					//System.out.println(goukei);
				}
			}


			System.out.println(goukei);






		}


	}


	//拡張ユークリッドでの逆元の求め方でnCkをつくる、前処理必須。

	static  int MAX = 510000;
	static  int MOD = 1000000007;

	 static long[] fac = new long[MAX];
	 static long[] finv = new long[MAX];
	 static long[] inv = new long[MAX];

	// テーブルを作る前処理
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

	// 二項係数計算
	static long COM(int n, int k){
	    if (n < k) return 0;
	    if (n < 0 || k < 0) return 0;
	    return fac[n] * (finv[k] * finv[n - k] % MOD) % MOD;
	}


}
