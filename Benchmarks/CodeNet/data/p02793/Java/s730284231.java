import java.util.*;
import java.io.*;

class EratosSieve{
	private int sieve[];
	private Set<Integer> primeSet = new HashSet<>();
	EratosSieve(int x){
		//篩の作成
		sieve = new int[x+1];
		sieve[0] = sieve[1] = -1;
		for(int i=2;i<=x;i++) {
			if(sieve[i]>0)continue;
			for(int j=i+i;j<=x;j+=i) {
				sieve[j] = i;
			}
		}
		//素数Setの作成
		Set<Integer> primeSet = new HashSet<>();
		for(int i=2;i<sieve.length;i++) {
			if(sieve[i] == 0)primeSet.add(sieve[i]);
		}
	}
	//0~xまでの篩の配列を返す。配列値は素数なら0。素数でなければ、最大の素因数。(0,1は素数でないので-1)
	int[] getSieve() {
		return sieve;
	}
	//0~xまでの、素数のSetを返す
	Set<Integer> getPrimeSet(){
		return primeSet;
	}
	//素数判定
	boolean isPrime(int x) {
		return sieve[x] == 0;
	}
	//xの素因数分解結果をmapで返す
	Map<Integer, Integer> primeFactrization(int x){
		Map<Integer, Integer> map = new HashMap<>();
		while(sieve[x]>0) {
			map.put(sieve[x], map.getOrDefault(sieve[x], 0) + 1);
			x /= sieve[x];
		}
		map.put(x, map.getOrDefault(x, 0)+1);
		return map;
	}
}

public class Main {
	static int mod = (int) 1e9 + 7;
	static int DX[] = { -1, 0, 1, 0 }, DY[] = { 0, -1, 0, 1 };
	static final int INF = Integer.MAX_VALUE / 3;
	static final long LINF = Long.MAX_VALUE / 3;

	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		int n = fs.nextInt();
		int a[] = fs.nextIntArray(n);
		Map<Integer, Integer> map = new HashMap<>();

		EratosSieve es = new EratosSieve(1000000);
		
		for(int i=0;i<n;i++) {
			int now = a[i];
			
			Map<Integer, Integer> tmap = es.primeFactrization(now);		
			for(int key : tmap.keySet()) {
				map.put(key, Math.max(map.getOrDefault(key, 0), tmap.get(key)));
			}
		}
		
		long t = 1;
		for(int key:map.keySet()) {
			long value = map.get(key);
			t = mul(t, modpow(key, value));
		}
		
		long ans = 0;
		for(int i=0;i<n;i++) {
			long tmp = div(t, a[i]);
			ans = plus(ans, tmp);
		}
		System.out.println(ans);
	}
	

	
	//MOD culculations
	static long plus(long x, long y) {
		return (x + y) % mod;
	}

	static long sub(long x, long y) {
		return (x - y + mod) % mod;
	}

	static long mul(long x, long y) {
		return (x * y) % mod;
	}

	static long div(long x, long y) {
		return x * modpow(y, mod - 2) % mod;
	}

	static long modpow(long x, long y) {
		if (y == 0)
			return 1;
		if (y % 2 == 1)
			return (x * modpow(x, y - 1)) % mod;
		long root = modpow(x, y / 2);
		return root * root % mod;
	}
	
	
}

//高速なScanner
class FastScanner {
	private BufferedReader reader = null;
	private StringTokenizer tokenizer = null;

	public FastScanner(InputStream in) {
		reader = new BufferedReader(new InputStreamReader(in));
		tokenizer = null;
	}

	public String next() {
		if (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				tokenizer = new StringTokenizer(reader.readLine());
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken();
	}

	public String nextLine() {
		if (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				return reader.readLine();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken("\n");
	}

	public long nextLong() {
		return Long.parseLong(next());
	}

	public int nextInt() {
		return Integer.parseInt(next());
	}

	public double nextDouble() {
		return Double.parseDouble(next());
	}

	public int[] nextIntArray(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = nextInt();
		return a;
	}

	public long[] nextLongArray(int n) {
		long[] a = new long[n];
		for (int i = 0; i < n; i++)
			a[i] = nextLong();
		return a;
	}
}