
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static long MOD = 1_000_000_007;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] s = new int[n];
		int[] t = new int[m];
		
		
		long[][] dp = new long[n+1][m+1];
		long[][] dp2 = new long[n+1][m+1];
		HashMap<Integer,TreeSet<Integer>> map = new HashMap<>();
		
		
		for (int i=0;i<n;i++) {
			s[i]=sc.nextInt();
		}
		for (int j=0;j<m;j++) {
			t[j]=sc.nextInt();
			if (!map.containsKey(t[j])) {
				map.put(t[j], new TreeSet<Integer>());
			}
			map.get(t[j]).add(j);
			
		}
		
		for (int j=0;j<=m;j++) {
			dp[0][j]=1;
			if (j<m) {
				if( map.get(t[j]).lower(j)!=null) {
					dp2[0][j]=dp2[0][map.get(t[j]).lower(j)]+1;
				} else {
					dp2[0][j]=1;
				}
			}
			
		}
		
		for (int i=0;i<n;i++) {
			
			for (int j=0;j<=m;j++) {
				dp[i+1][j]=dp[i][j];
				
				if (map.get(s[i]) != null
						&& map.get(s[i]).lower(j) != null) {
					dp[i+1][j]+=dp2[i][map.get(s[i]).lower(j)];
					dp[i+1][j]%=MOD;
					
				}
				if (j<m) {
					if( map.get(t[j]).lower(j)!=null) {
						dp2[i+1][j]=dp2[i+1][map.get(t[j]).lower(j)]+dp[i+1][j];
						dp2[i+1][j]%=MOD;
					} else {
						dp2[i+1][j]=dp[i+1][j];
					}
				}
				
				
			}
		}
		
		System.out.println(dp[n][m]);


	}



}


