import java.util.Scanner;

//It Prefokery Pio
public class Main{

	String lcs(String a, String b){
		a = " "+a; b = " "+b;
		int na = a.length(), nb = b.length();
		String[][] dp = new String[na][nb];
		for(int i=0;i<na;i++)dp[i][0]="";
		for(int i=0;i<nb;i++)dp[0][i]="";
		for(int i=1;i<na;i++)for(int j=1;j<nb;j++){
			char ca = a.charAt(i), cb = b.charAt(j);
			if(ca==cb)dp[i][j] = dp[i-1][j-1]+ca;
			else dp[i][j] = dp[i-1][j].length()<dp[i][j-1].length()?dp[i][j-1]:dp[i-1][j];
		}
		return dp[na-1][nb-1];
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