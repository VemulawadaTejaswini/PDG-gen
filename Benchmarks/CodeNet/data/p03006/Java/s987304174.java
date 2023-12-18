
import java.io.*;
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
	static long mod = (long)(1e9+7);
	public static void main(String[] args) {
		 FastReader sc = new FastReader();
		 int t = sc.nextInt();
		 Pair[] p = new Pair[t];
		 for(int i=0;i<t;++i) p[i] = new Pair(sc.nextInt(),sc.nextInt());
		 
		 Arrays.sort(p,new Comparator<Pair>() {

			@Override
			public int compare(Pair o1, Pair o2) {
				if(o1.x == o2.x) return o1.y - o2.y;
				return o1.x-o2.x;
			}
			 
		 });
		 Map<Integer,Integer> mapx = new HashMap<>();
		 Map<Integer,Integer> mapy = new HashMap<>();
		 for(int i=0;i<t;++i) {
			 Set<Integer> setx = new HashSet<>();
			 Set<Integer> sety = new HashSet<>();
		 for(int j=i+1;j<t;++j) {
		     setx.add(p[i].x-p[j].x);
			 sety.add(p[i].y-p[j].y);
		 }
		 for(int x : setx) add(mapx,x);
		 for(int y : sety) add(mapy,y);
		 
		 }
		 int maxx = 0,maxy=0;
		 for(int key : mapx.keySet()) maxx = Math.max(maxx,mapx.get(key));
		 for(int key : mapy.keySet()) maxy = Math.max(maxy,mapy.get(key));
		 System.out.println(t-Math.min(maxx, maxy));
		 out.close();
		 
	}
	private static void add(Map<Integer, Integer> map, int i) {
		// TODO Auto-generated method stub
		if(map.containsKey(i)) map.put(i, map.get(i)+1);
		else map.put(i, 1);
		
	}
	static class Pair{
		int x;
		int y;
		Pair(int x,int y){
			this.x = x;
			this.y = y;
		}
	}
}