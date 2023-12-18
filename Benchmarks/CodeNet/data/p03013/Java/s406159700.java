import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		FastScanner sc = new FastScanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		solve(sc,out);

		out.flush();
	}
	
	static int n,m;
	static int[] a,s;
	static int mod;

	public static void solve(FastScanner sc, PrintWriter out) {
		n = sc.nextInt();
		m = sc.nextInt();
		
		a = sc.nextIntArray(m);
		
		s = new int[n+1];
		
		mod = 1_000_000_007;
		int temp = 0;
		
		List<Integer> res = new ArrayList<Integer>();
		
		for(int i = 1; i < m; i++) {
			if(Math.abs(a[i-1] - a[i]) == 1) {
				out.println("0");
				return;
			}
		}
		
		for(int i : a) {
			s[i]= -1;
			dfs(temp, i-1);
			res.add(way);
			temp = i+1;
			way = 0;
		}
		
		dfs(temp, n);
		res.add(way);
		
		long m = res.get(0) % mod;
		
		for(int i = 1; i<  res.size(); i++) {
			m=(m*res.get(i)) % mod;
		}
		
		out.println(m);
	}
	
    static int way = 0;
    
    public static void dfs(int current, int a) {
        if(current == a) {
            way = (way + 1) % mod;
        }
        
        if(current + 2 <= a && s[current + 2] != -1) dfs(current + 2, a);
        if(current + 1 <= a && s[current + 1] != -1) dfs(current + 1, a);
    }

	public static int gcd(int a, int b) {
		if(a < b) return gcd(b, a);
		if(b == 0) return a;
		return gcd(b, a % b);
	}

	public static long gcd(long a, long b) {
		if(a < b) return gcd(b, a);
		if(b == 0) return a;
		return gcd(b, a % b);
	}

	public static int lcm(int a, int b) {
		return a / gcd(a, b) * b;
	}

	public static long lcm(long a, long b) {
		return a / gcd(a, b) * b;
	}
}

class Pair<K, V> extends AbstractMap.SimpleEntry<K, V> {

    public Pair(K key, V value) {
        super(key, value);
    }

    public Pair<V, K> swap() {
    	return new Pair<V, K>(getValue(), getKey());
    }
 }

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