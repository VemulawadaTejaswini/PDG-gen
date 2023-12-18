import java.io.*;
import java.util.*;
import java.util.Map.*;

public class Main {
	static int mod = (int)1e9+7;
	static Comparator<Integer> lower_bound = (x, y) -> x.compareTo(y) >= 0 ? 1 : -1;
	static Comparator<Integer> upper_bound = (x, y) -> x.compareTo(y) > 0 ? 1 : -1;

	public static void main(String[] args){
		FastScanner sc = new FastScanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		solve(sc,out);

		out.flush();
	}

	public static void solve(FastScanner sc, PrintWriter out) {
		int n = sc.nextInt();
		String[] s = new String[n];
		
		for(int i = 0; i < n; i++) s[i] = sc.next();
		
		List<String> list = new ArrayList<String>();
		
		for(int i = 0; i < n; i++) {
			char[] c = s[i].toCharArray();
			Arrays.sort(c);
			
			StringBuilder sb = new StringBuilder();
			
			for(char ch : c) sb.append(ch);
			
			list.add(sb.toString());
		}
		
		Collections.sort(list);
		
		Map<String, Integer> map = new HashMap<String, Integer>(); //個数
		
		for(String str : list) {
			map.put(str, map.containsKey(str) ? map.get(str) + 1 : 1);
		}
		
		long res = 0;
		
		for(Entry<String, Integer> tmp : map.entrySet()) {
			if(tmp.getValue() > 1) res+=comb(tmp.getValue(), 2);
		}
		
		out.println(res);
 	}
	
    static long comb(long n, long r){
        long num = 1;
        for(long i = 1; i <= r; i++){
            num = num * (n - i + 1) / i;
        }
        return num;
    }

	public static long gcd(long a, long b) {
		if(a < b) return gcd(b, a);
		if(b == 0) return a;
		return gcd(b, a % b);
	}

	public static long lcm(long a, long b) {
		return a / gcd(a, b) * b;
	}

	public static long factorial(int n) {
		long a;

		if(n > 0) {
			a = n * factorial(n - 1);
		}else{
			a = 1;
		}
		return a;
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

class UnionFind {
	int[] par;

	public UnionFind(int n) {
		par = new int[n];

		Arrays.fill(par, -1);
	}

	int root(int x) {
		if(par[x] < 0) return x;
		return par[x] = root(par[x]);
	}

	boolean unite(int x,int y) {
		x = root(x);
		y = root(y);

		if(x == y) return false;

		if(size(x) < size(y)) {
			int tmp = x;
			x = y;
			y = tmp;
		}

		par[x] += par[y];
		par[y] = x;

		return true;
	}

	boolean same(int x,int y) {
		int rx = root(x);
		int ry = root(y);
		return rx == ry;
	}

	int size(int a) {
		return -par[root(a)];
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