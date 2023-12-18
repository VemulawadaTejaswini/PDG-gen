import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		FastScanner sc = new FastScanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		solve(sc,out);

		out.flush();
	}

	public static void solve(FastScanner sc, PrintWriter out) {
		int n = sc.nextInt();
		
		String[] s = new String[n];
		int[] p = new int[n];
		
		List<Pair<String, Integer>> list = new ArrayList<Pair<String, Integer>>();
		
		for(int i = 0; i < n; i++) {
			s[i] = sc.next();
			p[i] = sc.nextInt();
			
			list.add(new Pair<String, Integer>(s[i], p[i]));
		}
		
		list.sort((a,b) -> a.getKey().compareTo(b.getKey()));
		
		List<List<Pair<String, Integer>>> temp = new ArrayList<List<Pair<String, Integer>>>();
		
		loop: for(int i = 0; i < n; i++) {
			if((list.size()-1 >= i+1 && list.get(i).getKey().equalsIgnoreCase(list.get(i+1).getKey())) || (0 <= i-1 && list.get(i).getKey().equals(list.get(i - 1).getKey()))) {
				for(int j = 0;  j < temp.size(); j++) {
					if(temp.get(j).get(0).getKey().equals(list.get(i).getKey())) {
						temp.get(j).add(list.get(i));
						continue loop;
					}
				}
			}
			temp.add(new ArrayList<Pair<String,Integer>>());
			temp.get(temp.size() - 1).add(list.get(i));
		}
		
		for(int i = 0; i < temp.size(); i++) {
			temp.get(i).sort((a,b) -> b.getValue() - a.getValue());
		}
		
		for(List<Pair<String, Integer>> t : temp) {
			for(Pair<String, Integer> pa : t) {
				for(int i = 0; i < n; i++) {
					if(p[i] == pa.getValue()) {
						out.println(i + 1);
						break;
					}
				}
			}
		}
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
}

class Pair<K, V> extends AbstractMap.SimpleEntry<K, V> {

    public Pair(final K key, final V value) {
        super(key, value);
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