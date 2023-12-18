import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args){
		new Main().run();
    }

    void run(){
      Scanner sc=new Scanner(System.in);
      int N=sc.nextInt();
      int W=sc.nextInt();
      int[] w=new int[N];
      long[] v=new long[N];
      for(int i=0;i<N;++i){
          w[i]=sc.nextInt();
          v[i]=sc.nextLong();
      }
      long[] dp=new long[W+1];
      for(int i=0;i<N;++i){
          for(int j=W-w[i];j>=0;--j){
    	      dp[j+w[i]]=Math.max(dp[j+w[i]],dp[j]+v[i]);
          }
      }
      long ans=0;
      for(long val:dp)ans=Math.max(ans,val);
      System.out.println(ans);
    }
}
