import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		FastScanner sc = new FastScanner(System.in);
		 int n = sc.nextInt();
		 Map<Integer,Integer> map = new HashMap<>();
		 int[] a = new int[n];
		 for(int i = 0; i < n; i++) {
			 int x = sc.nextInt();
			 a[i] = x;
			 if(map.containsKey(x)) {
				 map.put(x, map.get(x)+1);
			 }else {
				 map.put(x, 1);
			 }
		 }
		 Map<Integer, Long> map2 = new HashMap<>();
		 Map<Integer, Long> map3 = new HashMap<>();
		 long all = 0l;
		 for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			 int y = entry.getValue();
			 map2.put(entry.getKey(), (long)y*(y-1)/2);
			 map3.put(entry.getKey(), (long)(y-1)*(y-2)/2);
			 all += (long)y*(y-1)/2;
		 }
		 
		 for(int i = 0; i < n; i++) {
			 System.out.println(all - map2.get(a[i])+map3.get(a[i]));
		 }
		 
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
