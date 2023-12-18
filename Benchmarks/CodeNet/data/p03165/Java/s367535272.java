import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Problem ThanhYeuThu = new Problem();
		ThanhYeuThu.solve();
	}
	static class Problem {
		public void solve() {
			Scanner sc = new Scanner(System.in);
			String S = sc.next();
			String T = sc.next();
			int n = S.length();
			int m = T.length();
			int DP[][] = new int[n + 1][m + 1];
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= m; j++) {
					if (S.charAt(i - 1) == T.charAt(j - 1)) {
						DP[i][j] = DP[i - 1][j - 1] + 1;
					}
					else {
						DP[i][j] = Math.max(DP[i - 1][j], DP[i][j - 1]);
					}
				}
			}
			TruyVet(S,T,n,m,DP);
		}
		private void TruyVet(String S,String T,int u,int v,int DP[][]) {
			if (u == 0 || v == 0) {
				return;
			}
			if (S.charAt(u - 1) == T.charAt(v - 1)) {
				TruyVet(S,T,u - 1,v - 1,DP);
				System.out.print(S.charAt(u - 1));
			}
			else {
				if (DP[u][v] == DP[u - 1][v]) TruyVet(S,T,u - 1,v,DP);
				else TruyVet(S,T,u,v - 1,DP);
			}
		}
	}

}
