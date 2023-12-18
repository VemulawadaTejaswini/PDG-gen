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


	public static void solve(FastScanner sc, PrintWriter out) {
		int n = sc.nextInt();
		int k = sc.nextInt();
		String s = sc.next();
		
		int l = 0;
		int r = 0;
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'L') l++; else r++;
		}
		
		List<Integer> list = new ArrayList<>(); //L - R - L - R ... 
		
		int tmp = -1;
		for(int i = 0; i < n; i++) {
			char c = s.charAt(i);
			
			if(i == 0 && c == 'R') {
				list.add(0);
				tmp=0;
			}else if(i == 0 && c == 'L'){
				tmp++;
			}else{
				if(c == s.charAt(i - 1)) {
					tmp++;
				}else{
					list.add(tmp+1);
					tmp=0;
				}
			}
		}
		list.add(tmp+1);
		
		//出来るだけ変えれる方を変える
		
		List<Pair<Integer, Integer>> llist = new ArrayList<>(); //index, element
		
		for(int i = 0; i < list.size(); i+=2) {
			llist.add(new Pair<>(i, list.get(i)));
		}
		
		llist.sort((a,b) -> b.getValue() - a.getValue());
		
		List<Pair<Integer, Integer>> rlist = new ArrayList<>();
		
		for(int i = 1; i < list.size(); i+=2) {
			rlist.add(new Pair<>(i, list.get(i)));
		}
		
		rlist.sort((a,b) -> b.getValue() - a.getValue());
		
		for(int i = 0; i < k; i++) {
			l+=llist.get(i).getValue();
		}
		
		for(int i = 0; i < k; i++) {
			r+=rlist.get(i).getValue();
		}
		
		int[] bucket = new int[n];
		
		//lの方が大きかったら
		if(l>=r) {
			int res = 0;
			
			for(int i = 0; i < k; i++) {
				if(llist.get(i).getKey() == 0) {
					res+=llist.get(i).getValue()+ list.get(llist.get(i).getKey() + 1) - 1;
					bucket[llist.get(i).getKey()]++;
					bucket[llist.get(i).getKey() + 1]++;
				}else{
					res+=llist.get(i).getValue()+ list.get(llist.get(i).getKey() + 1) + list.get(llist.get(i).getKey()  - 1) - 1;
					bucket[llist.get(i).getKey()]++;
					bucket[llist.get(i).getKey() + 1]++;
					bucket[llist.get(i).getKey() - 1]++;
				}
			}
			
			for(int i = 0; i < list.size(); i++) {
				if(i % 2 == 0 && bucket[i] == 0) res+=list.get(i) - 1;
			}
			
			out.println(res);
		}else{
			int res = 0;
			
			for(int i = 0; i < k; i++) {
				if(rlist.get(i).getKey() == 0) {
					res+=rlist.get(i).getValue()+ list.get(rlist.get(i).getKey() + 1) - 1;
					bucket[rlist.get(i).getKey()]++;
					bucket[rlist.get(i).getKey() + 1]++;
				}else{
					res+=rlist.get(i).getValue()+ list.get(rlist.get(i).getKey() + 1) + list.get(rlist.get(i).getKey()  - 1) - 1;
					bucket[rlist.get(i).getKey()]++;
					bucket[rlist.get(i).getKey() + 1]++;
					bucket[rlist.get(i).getKey() - 1]++;
				}
			}
			
			for(int i = 0; i < list.size(); i++) {
				if(i % 2 == 0 && bucket[i] == 0) res+=list.get(i) - 1;
			}
			
			out.println(res);
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