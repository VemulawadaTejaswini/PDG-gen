
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
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
	public static void main(String[] args) {
		
		FastReader sc = new FastReader();
		 
         int n = sc.nextInt();
         int[] a = new int[n];
         TreeMap<Integer,Integer> map = new TreeMap<>();
         for(int i=0;i<n;++i) {
        	 a[i] = sc.nextInt();
        	 add(map,a[i]);
         }
         boolean yes = false;
        if(map.size()<=3 && n%3 == 0) {
        	List<Pair> list = new ArrayList<>();
        	for(int key : map.keySet()) {
        		list.add(new Pair(key,map.get(key)));
        	}
        	
        	if(map.size() == 1 && map.containsKey(0)) yes = true;
        	else if(map.size() == 2 && map.containsKey(0)) {
        		if(list.get(0).y == n/3 && list.get(1).y == (2*n)/3) yes = true;
        	}else if(map.size() == 3 && !map.containsKey(0)) {
        		Pair p = list.get(0), q = list.get(1), r = list.get(2);
        		if((p.x^q.x^r.x) == 0 && p.y == n/3 && q.y == n/3 && r.y == n/3)
        			yes = true;
        	}
        }
        if(yes) out.println("Yes");
        else out.println("No");
        	
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
	static class Pair{
		int x;
		int y;
		Pair(int x,int y){
			this.x = x;
			this.y = y;
		}
	}
 }