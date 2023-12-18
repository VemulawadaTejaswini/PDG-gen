import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		String s1 = sc.next();
		String s2 = sc.next();
		int M = s1.length();
		int N = s2.length();
		int current_max= 0;
		String common ="";
		int[][] dp =new int[M+1][N+1];
		for(int i=0; i<=M;i++) {
			for(int j =0; j<=N;j++) {
				if(i==0|| j==0) {
					dp[i][j]=0;
					continue;
				}
				else if(s1.charAt(i-1)==s2.charAt(j-1)) {
					dp[i][j] = dp[i-1][j-1]+1;
					if(dp[i][j]>current_max) {
						common+=s1.charAt(i-1);
						current_max = dp[i][j];
					}
//					pw.println(i+"::"+s1.charAt(i-1)+":"+dp[i][j]);
				}
				else {
					dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
				}
			}
		}
		
		pw.println(common);
		
		//end
		sc.close();
		pw.close();
	}
}
