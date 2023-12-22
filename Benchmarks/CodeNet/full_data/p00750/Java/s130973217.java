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
			int sumlen = 0;
			for(int i = 0; i < m; i++){
				from[i] = sc.nextInt();
				to[i] = sc.nextInt();
				str[i] = sc.next();
				sumlen += str[i].length();
			}
			int maxstrlen = 500;
			String [][] dp = new String[n][maxstrlen];
			for(int i = 0; i < n; i++){
				Arrays.fill(dp[i], INF);
			}
			dp[s][0] = "";
			
			for(int times = 0; times < 2 * n; times++){
				for(int i = 0; i < m; i++){
					for(int j = 0; j < maxstrlen; j++){
						if(dp[from[i]][j] == null) continue;
						int nextlen = j + str[i].length();
						if(nextlen >= maxstrlen) continue;
						String cand = dp[from[i]][j] + str[i];
						String value = (dp[to[i]][nextlen].compareTo(cand) > 0 ? cand :dp[to[i]][nextlen]);
						dp[to[i]][nextlen] = value;
					}
				}
			}
			
			String ans= INF;
			for(int i = 0; i < maxstrlen; i++){
				if(ans.compareTo(dp[g][i]) > 0){
					if(i > sumlen){
						ans = null;
						break;
					}
					else{
						ans = dp[g][i];
					}
				}
			}
			
			System.out.println(ans == null || ans.equals(INF) ? "NO" : ans);
		}
	}
	
	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}