
import java.util.*;

public class Main {// Main
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		int n =a.length();
		int m = b.length();
		int[][] dp = new int[n+1][m+1];
		
		
		for(int i = n-1 ;i >=0 ; i--) {
			for(int j = m-1 ;j >=0 ;j--) {
				if(a.charAt(i)==b.charAt(j)) {
					dp[i][j]= dp[i+1][j+1]+1;
				}else {
					dp[i][j] = Math.max(dp[i+1][j], dp[i][j+1]);
				}
			}
		}
		
		int row = 0 ; 
		int col = 0;
		String ans ="";
		while(row!=n && col!=m) {
			int cur = dp[row][col];
			int right = dp[row][col+1];
			int down = dp[row+1][col];
			int diagonal = dp[row+1][col+1];
			 if(cur == right) {
				col++;
			}else if(cur==down){
				row++;
			}else if(cur==diagonal+1) {
					ans+=a.charAt(row);
					row++;
					col++;
				}
		}
		
		
		
		
		
		
		
		
		
  System.out.println(ans);
	}

}