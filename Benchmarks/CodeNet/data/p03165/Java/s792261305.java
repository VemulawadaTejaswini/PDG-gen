import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next(), T = sc.next();
		sc.close();
		char s[] = new char[S.length()];
		char t[] = new char[T.length()];
		for(int i=0;i<S.length();i++) s[i]=S.charAt(i);
		for(int i=0;i<T.length();i++) t[i]=T.charAt(i);
		
		int n = s.length, m = t.length;
		int dp[][] = new int[n+1][m+1];// dp[N][M]:= sのN文字目、tのM文字目までにおける、最大一致数
		for(int i=1;i<n+1;i++) {
			for(int j=1;j<m+1;j++) {
				if(s[i-1] == t[j-1])dp[i][j] = dp[i-1][j-1]+1;
				else dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
			}
		}
		
		//dp配列から文字を復元する
		int len = dp[n][m];
		int now = len - 1;
		char ret[] = new char[len];
		for(int i = n, j = m; i > 0 && j > 0;) {
			if(s[i-1] == t[j-1]) { //これは誤り -> if(dp[i-1][j-1] == dp[i][j] - 1)
				ret[now--] = s[i-1];
				i--; j--;
			}
			else if(dp[i-1][j] == dp[i][j])i--;
			else j--;
		}
		String ans = new String(ret);
		System.out.println(ans);
		
	}
}
