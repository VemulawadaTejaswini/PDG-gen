import java.util.Scanner;

//It Prefokery Pio
public class Main{

	String lcs(String a, String b){
		int na = a.length();
		int nb = b.length();
		int dp[][] = new int[na+1][nb+1];
		for(int i=0;i<na;i++)dp[i][0] = 0;
		for(int i=0;i<nb;i++)dp[0][i] = 0;
		for(int i=1;i<=na;i++){
			for(int j=1;j<=nb;j++){
				if(a.charAt(i-1)==b.charAt(j-1)){
					dp[i][j] = dp[i-1][j-1] + 1;
				}
				else{
					dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
				}
			}
		}
		char[] r = new char[dp[na][nb]];
		int i = na;
		int j = nb;
		while(0<i&&0<j){
			if(dp[i][j]==dp[i-1][j])i--;
			else if(dp[i][j]==dp[i][j-1])j--;
			else{
				r[dp[i-1][j-1]] = a.charAt(i-1);
				i--;
				j--;
			}
		}
		return new String(r);
	}
	
	void run(){
		Scanner sc = new Scanner(System.in);
		for(;sc.hasNext();){
			String s = sc.next();
			String r = (new StringBuilder(s)).reverse().toString();
			System.out.println(lcs(s, r));
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}