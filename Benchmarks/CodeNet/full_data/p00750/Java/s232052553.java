import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
	int n,m,s,g;
	int [] from, to;
	String [] str;
	
	private void doit(){
		InStream sc = new InStream();
		while(true){
			n = sc.nextInt();
			m = sc.nextInt();
			s = sc.nextInt();
			g = sc.nextInt();
			if((n|m|s|g) == 0)break;
			from = new int[m];
			to = new int[m];
			str = new String[m];
			for(int i = 0; i < m; i++){
				from[i] = sc.nextInt();
				to[i] = sc.nextInt();
				str[i] = sc.next();
			}
			solve();
		}
	}
	
	private void solve(){
		String [] dp = new String[n];
		Arrays.fill(dp, "{");
		dp[g] = "";
		
		boolean update = true;
		for(int times = 0; times < 4 * n && update; times++){
			update = false;
			for(int i = 0; i < m; i++){
				if(dp[to[i]].equals("{")) continue;
				
				if(dp[from[i]].compareTo(str[i]) < 0) continue;
				
				String cand = str[i] + dp[to[i]];
				if(dp[from[i]].compareTo(cand) > 0){
					update = true;
					dp[from[i]] = cand;
					if(times >= n && from[i] == s){
						System.out.println("NO");
						return ;
					}
				}
			}
		}
		System.out.println(dp[s].equals("{") ? "NO" : dp[s]);
	}
	
	class InStream{
		BufferedReader in;StringTokenizer st;
		public InStream() {
			this.in = new BufferedReader(new InputStreamReader(System.in));
			this.st = null;
		}
		String next() {
			while (st==null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(in.readLine());
				} catch (Exception e) {}
			}
			return st.nextToken(); 
		}
		boolean hasNext(){
			try {
				st = new StringTokenizer(in.readLine());
				return true;
			} catch (Exception e) {return false;}
		}
		int nextInt() {	return Integer.parseInt(next()); }
		long nextLong() {return Long.parseLong(next());	}
		double nextDouble() {return Double.parseDouble(next());	}
	}
	
	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}