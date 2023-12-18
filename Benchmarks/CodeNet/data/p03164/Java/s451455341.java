import java.io.*;
import java.util.*;

public class Main{

    
    public static void main(String[] args){
		new Main().run();
    }

    void run(){
      Scanner sc=new Scanner(System.in);
      int N=sc.nextInt();
      long W=sc.nextLong();
      long[] w=new long[N];
      int[] v=new int[N];
      for(int i=0;i<N;++i){
          w[i]=sc.nextLong();
          v[i]=sc.nextInt();
      }
      long[] dp=new long[100001];
      Arrays.fill(dp,1L<<60);
      dp[0]=0;
      for(int i=0;i<N;++i){
          for(int j=dp.length-v[i]-1;j>=0;--j){
    	      dp[j+v[i]]=Math.min(dp[j+v[i]],dp[j]+w[i]);
          }
      }
      long ans=0;
      for(int i=0;i<dp.length;++i){
          if(dp[i]<=W)ans=Math.max(ans,i);
      }
      System.out.println(ans);
    }
}
