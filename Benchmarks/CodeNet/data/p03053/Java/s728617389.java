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
    public final static int MAX = (int) 90000000;
  // static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
	   
	 FastReader sc = new FastReader();
		
	int h = sc.nextInt();
	int w = sc.nextInt();
	List<Pair> temp = new ArrayList<>();
	boolean[][] tab = new boolean[h][w];
	
	for(int i=0;i<h;++i) {
		String s = sc.next();
		for(int j=0;j<w;++j) {
			if(s.charAt(j) == '#') {
				tab[i][j] = true;
				temp.add(new Pair(i,j));
			}
		}
	}
	int[] dx = {0,0,-1,1};
	int[] dy = {-1,1,0,0};
		
	int black = temp.size();
	int ans = 0;
	while(black != h*w) {
		List<Pair> last = new ArrayList<>();
		for(Pair p : temp) {
			for(int i=0;i<dx.length;++i) {
				Pair pr = new Pair(p.x+dx[i],p.y+dy[i]);
				if(inGrid(pr.x,pr.y,h,w) && !tab[pr.x][pr.y]) {
					last.add(pr);
					tab[pr.x][pr.y] = true;
				}
			}
		}
		
		temp = last;
		black+=temp.size();
		++ans;
	}
	out.println(ans);
	
 	out.close();
	}
	
	 private static boolean inGrid(int x, int y, int h, int w) {
		 if(x>=0 && y>=0 && x<h && y<w)
			 return true;
	    
	return false;
}

	static class Pair{
	    	int x;
	    	int y;
	    	Pair(int x,int y){
	    		this.x=x;
	    		this.y=y;
	    	}
	    	@Override
	        public int hashCode() {
	            final int prime = 31;
	           int  result = prime * x + y; 
	            return result;
	        }
	    	
	    	 @Override
	    	    public boolean equals(Object obj) {
	    	        if (this == obj)
	    	            return true;
	    	        if (obj == null)
	    	            return false;
	    	        if (getClass() != obj.getClass())
	    	            return false;
	    	        Pair other = (Pair) obj;
	    	        if (x != other.x && y != other.y)
	    	            return false;
	    	        return true;
	    	    }
	    	 @Override
	    	 public String toString() {
	    		 return "{"+String.valueOf(x)+","+String.valueOf(y)+"}";
	    	 }
	    	
	    }
}