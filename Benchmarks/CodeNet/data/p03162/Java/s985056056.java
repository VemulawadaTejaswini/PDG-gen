import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args){
		new Main().run();
    }

    void run(){
      Scanner sc=new Scanner(System.in);
      int N=sc.nextInt();
      int[][] A=new int[N][3];
      long[][] dp=new long[N][3];
      for(int i=0;i<N;++i){
          for(int j=0;j<3;++j){
	          A[i][j]=sc.nextInt();
          }
      }
      for(int i=0;i<N;++i){
          for(int pre=0;pre<3;++pre){
    	      for(int ne=0;ne<3;++ne){
              	if(pre==ne)continue;
            	  dp[i][ne]=Math.max(dp[i][ne],(i>0?dp[i-1][pre]:0)+A[i][ne]);
        	  }
          }
      }
      long ans=0;
      for(int i=0;i<3;++i){
          ans=Math.max(ans,dp[N-1][i]);
      }
      System.out.println(ans);
    }
}
