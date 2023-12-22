import java.util.Scanner;


public class Main{
    public  static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        	while(sc.hasNext()) {
        		long[][] dp=new long[5][4001];
        		int n = sc.nextInt();
        		dp[0][0]=1;
        		for(int i=0; i<4; i++) {//turn
        			int max=i*1000;
        			for(int j=0; j<=max; j++) {//sum
        				for(int k=0; k<=1000; k++) {
        					dp[i+1][j+k]+=dp[i][j];
        				}
        			}
        		}
//        		dfs(sum, turn){
//        			turn++;
//        			if(turn == 4) {
//        				s[sum]++;
//        			}
//        			for(int k=0; k<=1000; i++) {
//        				dfs(sum+k, turn);
//        			}
//        		}
        		System.out.println(dp[4][n]);
        	}
        }
    }
}
