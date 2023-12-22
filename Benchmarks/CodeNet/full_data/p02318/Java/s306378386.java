import java.util.Scanner;
 
 
public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
	
		char[] X = sc.next().toCharArray();
		char[] Y = sc.next().toCharArray();
		int X_len = X.length;
		int Y_len = Y.length;
		int[][] dp = new int[X_len+1][Y_len+1];
		//init
		for(int i=0; i<=X_len;i++){
			dp[i][0] = i;
		}
		for(int j=0 ;j<=Y_len; j++){
			dp[0][j] = j;
		}
		
		for(int i=0; i<X_len; i++){
			for(int j=0; j<Y_len; j++){
				
				if(X[i] == Y[j]){
					dp[i+1][j+1] = dp[i][j];
				}else{
					dp[i+1][j+1] = Math.min(Math.min(dp[i+1][j], dp[i][j+1]), dp[i][j])+1;
				}
				
			}
		}
		
		System.out.println(dp[X_len][Y_len]);
		
		sc.close();
	}
	
	
	
}
