
import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.util.Stack;
import java.util.regex.Pattern;

public class Main {
	
	public static class FastReader {
		BufferedReader br;
		StringTokenizer st;
		//it reads the data about the specified point and divide the data about it ,it is quite fast
		//than using direct 

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (Exception r) {
					r.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());//converts string to integer
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
			} catch (Exception r) {
				r.printStackTrace();
			}
			return str;
		}
	}
	
	public static PrintWriter out = new PrintWriter (new BufferedOutputStream(System.out));
	static long mod = (long) (1e9+7);
	static int N = (int) 1e5;
//	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		 FastReader sc = new FastReader();

		 int n = sc.nextInt();
		 int[] a = new int[n];
		 long[] pre = new long[n+1];
		 Map<Long,Integer> map = new HashMap<>();
		 map.put(0L, 1);
		 long ans = 0;
		 for(int i=1;i<=n;++i) {
			 a[i-1] = sc.nextInt();
			 pre[i] = pre[i-1]+a[i-1];
			 add(map,pre[i]);
		 }
		 
		 for(long key : map.keySet()) {
			 long x = map.get(key);
			 ans+=(x*(x-1))/2;
		 }
		 out.println(ans);
		 
		 out.close();
	}
	

	private static void add(Map<Long, Integer> map, long i) {
		// TODO Auto-generated method stub
		if(map.containsKey(i)) map.put(i, map.get(i)+1);
		else map.put(i, 1);
		
	}
	private static void delete(Map<Integer, Integer> map, int i) {
		if(map.containsKey(i)) {
			if(map.get(i) == 1) map.remove(i);
			else map.put(i, map.get(i)-1);
		}
		
	}
}