import java.util.*;
import java.io.*;

public class Main{
	static int dp[][] = new int[55][2550];
  public static void main(String args[]){
    	Scanner in = new Scanner(System.in);
    	int n = in.nextInt();
      	int av = in.nextInt();
      	int a[] = new int[n];
      	for(int i =0;i<n;i++){
        	a[i] = in.nextInt();
        }
    	dp[0][0]=1;
      	for(int i = 1;i <= n;i++){
        	for(int j = i-1;j>=0;j--)		
            for(int tar = 0;tar<=2500;tar++){
                      dp[j+1][tar+a[i-1]]+=dp[j][tar];
              }
        }
      	int ans =0;
    	for(int i=1;i<=n;i++){
        	ans+=dp[i][av*i];
        }
    	System.out.println(ans);
    }
}