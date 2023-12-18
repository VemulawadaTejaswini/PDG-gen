import java.io.*;
import java.util.*;

public class Main {
	static final int MOD = 1_000_000_007;

	public static void main(String[] args){
		FastScanner sc = new FastScanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		solve(sc,out);

		out.flush();
	}

	public static void solve(FastScanner sc, PrintWriter out) {
		int n = sc.nextInt();
		
		List<Pair<Integer,Integer>> list = new ArrayList<Pair<Integer,Integer>>();
		
		for(int i = 0; i < n; i++) {
			list.add(new Pair<Integer,Integer>(sc.nextInt(),sc.nextInt()));
		}
		
		list.sort((a,b) -> a.getValue() - b.getValue());
		
		long sum = 0;
		int end = 0;
		
		for(int i = 0; i < n; i++) {
			if(end != list.get(i).getValue()) {
				end = list.get(i).getValue();
				sum+=list.get(i).getKey();
			}else{
				sum+=list.get(i).getKey();
			}
			if(end < sum) {
				out.println("No");
				return;
			}
		}
		out.println("Yes");
		
	}

	public static long gcd(long a, long b) {
		if(a < b) return gcd(b, a);
		if(b == 0) return a;
		return gcd(b, a % b);
	}

	public static long lcm(long a, long b) {
		return a / gcd(a, b) * b;
	}

	public static long min(long... a) {
		long min = Long.MAX_VALUE;
		for(int i = 0; i < a.length; i++) {
			if(a[i] < min) min = a[i];
		}
		return min;
	}

	public static long max(long... a) {
		long max = Long.MIN_VALUE;
		for(int i = 0; i < a.length; i++) {
			if(a[i] > max) max = a[i];
		}
		return max;
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