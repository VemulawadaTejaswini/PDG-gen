import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		FastScanner sc = new FastScanner(System.in);
		long n = sc.nextLong(), m = sc.nextLong();
		long[] list = new long[(int)n];
		for(int i = 0; i < n; i++) {
			list[i] = sc.nextLong();
		}
		ArrayList<Integer> map = new ArrayList<>();
		ArrayList<Integer> li = new ArrayList<>(); 
		for(int i = 0; i < m; i++) {
			int a = sc.nextInt(), b = sc.nextInt();
			notinc(map, a, b);
			
			if(list[a-1] > list[b-1]) {
				if(!li.contains(a))li.add(a);
			}else if(list[a-1] < list[b-1]) {
				if(!li.contains(b))li.add(b);
			}
		}
		long ans = n-map.size()+li.size();
		System.out.println(ans);
	}
	
	static ArrayList<Integer> notinc(ArrayList<Integer> map, int a, int b) {
		if(!map.contains(a)) {
			map.add(a);
		}
		if(!map.contains(b)) {
			map.add(b);
		}
		return map;
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