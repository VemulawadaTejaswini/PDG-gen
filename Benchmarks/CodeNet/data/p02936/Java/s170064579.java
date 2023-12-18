import java.io.*;
import java.util.*;

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
	static int n,q;

	public static void solve(FastScanner sc, PrintWriter out) {
		n = sc.nextInt();
		q = sc.nextInt();
		
		List<Pair<Integer, Integer>> list = new ArrayList<Pair<Integer,Integer>>();
		
		for(int i = 0; i < n-1; i++) {
			list.add(new Pair<>(sc.nextInt(), sc.nextInt()));
		}
		
		list.sort((x,y) -> x.getKey() - y.getKey());
		
		int[] t = new int[n+1];
		
		for(int i = 0; i < q; i++) {
			int p = sc.nextInt();
			int x = sc.nextInt();
			
			t[p] += x;
		}
		
		int[] res = new int[n + 1];
		
		res[1] = t[1];
		
		boolean[] flag = new boolean[n+1];
		
		for(int i = 0; i < n-1; i++) {
			Pair<Integer, Integer> pair = list.get(i);
			res[pair.getValue()]+=res[pair.getKey()];
			if(!flag[pair.getValue()]) {
				res[pair.getValue()]+=t[pair.getValue()];
				flag[pair.getValue()] = true;
			}
		}
		
		for(int i = 1; i <= n; i++) {
			out.print(res[i] + " ");
		}
		
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

	public static long comb(long n, long r) {
		long num = 1;
		for(long i = 1; i <= r; i++){
			num = num * (n - i + 1) / i;
		}
		return num;
	}

	public static<T> HashMap<T, Integer> numbers(List<T> list){
		HashMap<T, Integer> map = new HashMap<>();
		for(T t : list) {
			if(map.containsKey(t)) {
				map.put(t, map.get(t) + 1);
			}else{
				map.put(t, 1);
			}
		}
		return map;
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