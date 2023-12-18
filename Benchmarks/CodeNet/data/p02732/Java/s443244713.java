import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		FastScanner sc = new FastScanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		for(; n > 0; n--) {
			list.add(sc.nextInt());
		}
		
		Map<Integer,Integer> map = move(list);
		
		Map<Integer,Long> map2 = new HashMap<>();
		Map<Integer,Long> map3 = new HashMap<>();
		
		
		long ans = 0l;
		for(Integer key:map.keySet()) {
			ans += pick(map.get(key));
			map2.put(key,pick(map.get(key)));
			map3.put(key,pick(map.get(key)-1));
		}
		
		for(int i = 0; i < list.size(); i++) {
			int k = list.get(i);
			long ans2 = ans + map3.get(k) - map2.get(k);
			System.out.println(ans2);
		}
		
	}
	
	static Map<Integer,Integer> move(ArrayList<Integer> list) {
		Map<Integer,Integer> map = new HashMap<>();
		for(int i = 0; i < list.size(); i++) {
			int key = list.get(i);
			if(map.containsKey(key)) {
				map.put(key, map.get(key)+1);
			}else {
				map.put(key, 1);
			}
		}
		return map;
	}
	
	static long pick(int a) {
		long ans = a*(a-1)/2;
		return ans;
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