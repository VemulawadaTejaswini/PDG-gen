import java.util.*;

public class Main{
	String INF = "{";
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int m = sc.nextInt();
			int s = sc.nextInt();
			int g = sc.nextInt();
			if((n|m|s|g) == 0)break;
			int [] from = new int[m];
			int [] to = new int[m];
			String [] str = new String[m];
			for(int i = 0; i < m; i++){
				from[i] = sc.nextInt();
				to[i] = sc.nextInt();
				str[i] = sc.next();
			}
			String [] dp = new String[n];
			Arrays.fill(dp, INF);
			dp[g] = "";
			
			boolean isNO = false;
			for(int times = 0; times < 2 * n; times++){
				for(int i = 0; i < m; i++){
					if(dp[to[i]].equals(INF)) continue;
					String cand = str[i] + dp[to[i]];
					if(dp[from[i]].compareTo(cand) > 0){
						dp[from[i]] = cand;
						if(times >= n && to[i] == s){
							isNO = true;
							break;
						}
					}
				}
				if(isNO) break;
			}
			System.out.println(isNO || dp[s].equals(INF) ? "NO" : dp[s]);
		}
	}
	
	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}