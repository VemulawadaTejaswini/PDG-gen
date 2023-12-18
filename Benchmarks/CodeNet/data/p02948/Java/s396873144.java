
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.*;


public class Main {
	
	public static class FastReader {
		BufferedReader br;
		StringTokenizer st;
	

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
    public static long mod = (long) (1e9+7);
    public final static int MAX = (int)1e5;
  // static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
	   
	 FastReader sc = new FastReader();
	 int n = sc.nextInt();
	 int m = sc.nextInt();
	 List<Integer>[] edge = new ArrayList[MAX+1];
	 for(int i=0;i<edge.length;++i) edge[i] = new ArrayList<>();
	
	 TreeMap<Integer,Integer> map = new TreeMap<>();
	 for(int i=0;i<n;++i) {
		 int u = sc.nextInt();
		 int v = sc.nextInt();
		 edge[u].add(v);
		
	 }
	
	
	 long ans = 0;
	 for(int i=1;i<=m;++i) {
		for(int x : edge[i]) add(map,x);
		if(map.size() != 0) {
			ans+=map.lastKey();
			delete(map,map.lastKey());
		}
	 }
	
	 out.print(ans);
	 out.close();
		
	}
	

	private static void add(TreeMap<Integer, Integer> map, int i) {
		// TODO Auto-generated method stub
		if(map.containsKey(i)) map.put(i, map.get(i)+1);
		else map.put(i, 1);
		
	}
	private static void delete(TreeMap<Integer, Integer> map, int i) {
		if(map.containsKey(i)) {
			if(map.get(i) == 1) map.remove(i);
			else map.put(i, map.get(i)-1);
		}
		
	}
	
}