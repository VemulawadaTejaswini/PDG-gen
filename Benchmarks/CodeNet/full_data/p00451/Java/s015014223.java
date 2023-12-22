import java.util.Arrays;
import java.util.Scanner;


public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		for(;;){
			String s = sc.next();
			if(s=="EOF") break;
			String t=sc.next();
			int sl = s.length(),tl=t.length();
			int[][] dp = new int[sl+1][tl+1];
			int max=0;
			for(int i=1;i<sl+1;i++){
				for(int j=1;j<tl+1;j++){
					if(s.charAt(i-1)==t.charAt(j-1)){
						dp[i][j] = dp[i-1][j-1]+1;
						max = Math.max(max, dp[i][j]);
					}else{
						dp[i][j]=0;
					}
				}
			}
			System.out.println(max);
		}
	}
}