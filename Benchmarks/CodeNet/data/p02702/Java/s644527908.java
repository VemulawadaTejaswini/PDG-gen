import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			String S = scan.next();
			
			String[] T = new String[S.length()+1];
			long []amari = new long[S.length()+1];
			Map<Long,Integer>map = new TreeMap<Long,Integer>();
			T[S.length()] = "0";
			amari[S.length()] = 0;
			map.put(amari[S.length()], 1);
			COMinit();

			for(int i = 0;i<S.length();i++) {
				//T[i] = S.substring(i, S.length());
				amari[i] = Long.valueOf(T[i])%2019;
				if(!map.containsKey(amari[i])) {
					map.put(amari[i], 1);
				}else {
					map.put(amari[i], map.get(amari[i])+1);
				}
			}
			
			long goukei = 0;
			
			for(Long Key:map.keySet()) {
				//System.out.print(Key);
				//System.out.print(" ");
				//System.out.println(map.get(Key));
				if(map.get(Key)>=2)goukei+=COM(map.get(Key),2);
			}
			//System.out.println();
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
