import java.util.*;
import java.io.*;

public class Main {	
	public static void main(String[] args) {
		FastScanner fs = new FastScanner();
		Map<String, Integer> map = new HashMap<>();
		int N = fs.nextInt();

		for(int i=0; i<N; i++){
			String s = fs.next();
			if (map.containsKey(s)) {		
				int tmp = map.get(s);		
				map.put(s, ++tmp);
			} else {
				map.put(s,1);
			}
		}

		int M = fs.nextInt();

		for(int i=0; i<M; i++){
			String t = fs.next();
			if (map.containsKey(t)) {		
				int tmp = map.get(t);		
				map.put(t, --tmp);
			} else {
				map.put(t,-1);
			}
		}

		int ans = 0;		
		for (String key : map.keySet()) {	
			ans = Math.max(ans,map.get(key));			
		}
		
		System.out.println(ans);

	}
	
	static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");

		public String next() {
			while (!st.hasMoreElements())
				try {
					st=new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}

		public long nextLong() {
			return Long.parseLong(next());
		}

		public int[] readArray(int n) {
			int[] a=new int[n];
			for (int i=0; i<n; i++) {
				a[i]=nextInt();
			}
			return a;
		}

		public double nextDouble() {
			return Double.parseDouble(next());
		}

	}
	
}
