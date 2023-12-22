import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;



public class Main {
	public static class FastReader {
			BufferedReader br;
			StringTokenizer root;
			
	 
			public FastReader() {
				br = new BufferedReader(new InputStreamReader(System.in));
			}
	 
			String next() {
				while (root == null || !root.hasMoreTokens()) {
					try {
						root = new StringTokenizer(br.readLine());
					} catch (Exception addd) {
						addd.printStackTrace();
					}
				}
				return root.nextToken();
			}
	 
			int nextInt() {
				return Integer.parseInt(next());
			}
	 
			double nextDouble() {
				return Double.parseDouble(next());
			}
	 
			long nextLong() {
				return Long.parseLong(next());
			}
	 
			String nextLine() {
				String str = "";
				try {
					str = br.readLine();
				} catch (Exception addd) {
					addd.printStackTrace();
				}
				return str;
			}
		}
	 
	public static PrintWriter out = new PrintWriter (new BufferedOutputStream(System.out));
	public static FastReader sc = new FastReader();
 
	static int mod = (int)(1e9+7),MAX=(int)(1e5+10);
	static List<int[]>[] edges;
	
	public static void main(String[] args) throws IOException{
	
		int n = sc.nextInt();
		long[] a = new long[n];
		Map<Long,Integer> map = new HashMap<>();
		long ans = 0;
		for(int i=0;i<n;++i) {
			a[i] = sc.nextLong();
			ans+=a[i];
			add(map,a[i],1);
		}
		int q = sc.nextInt();
		while(q-->0) {
			long b = sc.nextLong();
			long c = sc.nextLong();
			int bf = map.getOrDefault(b, 0);
			if(bf > 0) {
			ans-=b*bf;
			ans+=c*bf;
			add(map,c,bf);
			map.remove(b);
		  }
			out.println(ans);
		}
	  out.close();
	}
	  static void add(Map<Long, Integer> map, long a,int val) {
			if(map.containsKey(a)) map.put(a, map.get(a)+val);
			else map.put(a, val);
			
		}
		 static void delete(Map<Integer, Integer> map, int i,int val) {
			if(map.containsKey(i)) {
				if(map.get(i) == val) map.remove(i);
				else map.put(i, map.get(i)-val);
			}
			
		}
}