import java.util.*;

public class Main{
	int n,m,s,g;
	int [] from, to;
	String [] str;
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
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
		for(int times = 0; times < 5 * n; times++){
			if(! update) break;
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
	
	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}