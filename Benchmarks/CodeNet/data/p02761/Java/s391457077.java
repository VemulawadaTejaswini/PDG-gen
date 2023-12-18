import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		FastScanner sc = new FastScanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		boolean ans = true;
		int n = sc.nextInt(), m = sc.nextInt();
		Map<Integer,Integer> map = new HashMap<>();
		for(int i = 0; i < m; i++) {
			int a = sc.nextInt(), b = sc.nextInt();
			if(map.containsKey(a)) {
				if(map.get(a) != b) {
					ans = false;
					break;
				}
			}else {
				map.put(a, b);
			}
			
		}
		if(!map.containsKey(1))ans = false;
		if(map.get(1) == 0) ans = false;
		
		if(ans) {
			List<Integer> key = new LinkedList<>(map.keySet());
			List<Integer> value = new LinkedList<>(map.values());
			for(int i = 1; i <= n; i++) {
				if(key.contains(i)) {
					pw.print(map.get(i));
				}else {
					pw.print(0);
				}
			}
		}else {
			pw.print(-1);
		}
		pw.close();
	}
	
	static class FastScanner {
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
}