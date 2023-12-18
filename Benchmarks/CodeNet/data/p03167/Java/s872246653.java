import java.util.*;
public class Main{
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int h = sc.nextInt();
      int w = sc.nextInt();
      char ch[][] = new char[h][w];
      for(int i=0 ; i<h ; i++){
        String s = sc.next();
      	for(int j=0 ; j<w ; j++){
        	ch[i][j] = s.charAt(j);
        }
      }
      
      int dp[][] = new int[h+1][w+1];
      dp[h-1][w-1] = 1;
      for(int i = h-1 ; i >= 0 ; i--){
      	for(int j = w-1 ; j >=0 ; j--){
        	if(i==h-1 && j==w-1)
            	continue;
          	else if(ch[i][j]=='#')
          		dp[i][j] = 0;
          	else
              	dp[i][j] = dp[i+1][j] + dp[j][i+1];
          }
      }
      System.out.println(dp[0][0]);
    }
}