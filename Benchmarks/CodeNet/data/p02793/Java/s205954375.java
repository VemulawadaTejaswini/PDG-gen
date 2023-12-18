import static java.util.Comparator.comparing;

import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(System.out);
        Solver solver = new Solver(System.in, out);
        solver.solve();
        out.close();
    }
}
class Solver {
	Scanner sc;
	PrintWriter out;
    public Solver(InputStream in, PrintWriter out) {
    	sc = new Scanner(in);
    	this.out = out;
    }
    // ==========================================================
    // a の mod m での逆元を返す		
    long modinv(long a, long m) {		
    	long b = m, u = 1, v = 0, wk;	
    	while (b > 0) {	
    		long t = a / b;
    		a -= t * b; wk = a; a = b; b = wk;
    		u -= t * v; wk = u; u = v; v = wk;
    	}	
    	u %= m; 	
    	if (u < 0) u += m;	
    	return u;	
    }		
    // 最大公約数の取得			
    long gcd(long a, long b) {			
    	if (b == 0)	return a;	
    	return gcd(b, a % b);		
    }			
    // 最小公倍数の取得			
    long lcm(long a, long b) {			
    	return a / gcd(a, b)  * b;		
    }			
    final long MOD = 1000000007;
    public void solve() {
    	int N = ni();
    	int[] A = ndi(N);
    	// 数字が大きいので lcm() は使えない
//    	long lcm = 1;
//    	for (int i = 0; i < N; i++) {
//			lcm = lcm(lcm, A[i]);
//		}
    	// 素因数分解した結果の、素数と指数の組み合わせをセットするマップ
    	Map<Integer, Integer> wk, map = new HashMap<>();
    	Sieve sieve = new Sieve(1000000);
    	int cnt;
    	for (int i = 0; i < N; i++) {
        	wk = sieve.factor(A[i]);
        	for(int key : wk.keySet()) {
        		cnt = wk.get(key);
        		// 指数はその素数の中の最大値を残す　→　最小公倍数の計算で使う
        		map.merge(key, cnt, (v1, v2) -> { return Math.max(v1, v2); });
        	}
		}
    	// 最小公倍数の計算
    	long lcm = 1;
    	for(int key : map.keySet()) {
    		cnt = map.get(key);
    		for (int i = 0; i < cnt; i++) {
        		lcm = (lcm * key) % MOD;
			}
    	}
    	long ans = 0;
    	for (int i = 0; i < N; i++) {
//			ans = (ans + lcm / A[i]) % MOD;
    		ans = (ans + lcm * modinv(A[i], MOD)) % MOD;		
		}
    	out.println(ans);
    }
    //-----------------------------------
    // 多くの数を素因数分解する場合に使うクラス
    //-----------------------------------
    class Sieve {
    	int n;
    	int[] f;					// エラトステネスの篩(ふるい）の変形（割った素数を保存する）
    	List<Integer> primes = new ArrayList<>();	// 素数の配列
    	
    	// 初期化　n 以下の数を素数判定する　→　これを作るのは１回だけ
    	public Sieve(int n) {
    		this.n = n;
    		f = new int[n+10];
    		for (int i = 0; i < f.length; i++) {
				f[i] = i;							// 初期値として全て素数とする
			}
    		f[0] = f[1] = -1;						// ０，１は素数でない
    		for(int i = 2; i*i <= n; i++) {
    			if(f[i] != i)	continue;			// 素数でない
    			primes.add(i);						// 素数を保存
    			for (int j = i*i; j <= n; j += i) {
					if(f[j] == j)	f[j] = i;		// 割った素数を保存（最初に割った素数）
				}
    		}
    	}
    	// 素数判定
    	boolean isPrime(int x) {
    		return f[x] == x;
    	}
    	// 素因数分解　引数  12 --> 2 * 2 * 3　３つ素数がセットされたリストを返す
    	List<Integer> factorList(int arg) {
    		int x = arg;
    		List<Integer> ans = new ArrayList<>();
    		while(x != 1) {
    			ans.add(f[x]);
    			if(f[x] == 0) {
    				out.println("zero devide  x = " + x + "  arg = " + arg);
    				x = 1;
    			} else {
    				x /= f[x];
    			}
    		}
    		return ans;
    	}
    	// 素因数分解　引数　12 --> 2 * 2 * 3  Map で　(2, 2) (3, 1) を返す
    	Map<Integer, Integer> factor(int x) {
    		Map<Integer, Integer> ans = new HashMap<>();
    		List<Integer> flist = factorList(x);
    		if(flist.size() == 0)	return ans;
    		for(int p : flist) {
    			ans.merge(p, 1, Integer::sum);
    		}
    		return ans;
    	}
    }
    // Set に入れるなら　PPKEY　を使う！
    static class PP{
    	public int key, val;
    	public PP(int key, int val) {
    		this.key = key;
    		this.val = val;
    	}
		public int getKey() {
			return key;
		}
		public void setKey(int key) {
			this.key = key;
		}
		public int getVal() {
			return val;
		}
		public void setVal(int val) {
			this.val = val;
		}
    }
    // ------------------------------------------
    // 入力
    // ------------------------------------------
    public int ni() {
    	return sc.nextInt();
    }
    public long nl() {
    	return sc.nextLong();
    }
    public String ns() {
    	return sc.next();
    }
    public char[] nc() {
    	return sc.next().toCharArray();
    }
    public int[] ndi(int N) {
    	int[] ans = new int[N];
    	for (int i = 0; i < N; i++) {
			ans[i] = ni();
		}
    	return ans;
    }
    public long[] ndl(int N) {
    	long[] ans = new long[N];
    	for (int i = 0; i < N; i++) {
			ans[i] = nl();
		}
    	return ans;
    }
    public String[] nds(int N) {
    	String[] ans = new String[N];
    	for (int i = 0; i < N; i++) {
			ans[i] = ns();
		}
    	return ans;
    }
    public char[][] ndc(int N) {
    	char[][] ans = new char[N][];
    	for (int i = 0; i < N; i++) {
			ans[i] = nc();
		}
    	return ans;
    }
    public int[][] nddi(int N, int S) {
    	int[][] ans = new int[N][S];
    	for (int i = 0; i < N; i++) {
			for (int j = 0; j < S; j++) {
				ans[i][j] = ni();
			}
		}
    	return ans;
    }
}
