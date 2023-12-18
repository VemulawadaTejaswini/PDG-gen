import java.io.*;
import java.util.*;

public class Main{

    final long mo=(long)1e9+7;
    
    public static void main(String[] args){
		new Main().run();
    }

    void run(){
      Scanner sc=new Scanner(System.in);
      int N=sc.nextInt();
      int K=sc.nextInt();
      long[] H=new long[N];
      for(int i=0;i<N;++i){
          H[i]=sc.nextLong();
      }
      long[] cost=new long[N];
      Arrays.fill(cost,1L<<60);
      cost[0]=0;
      for(int i=0;i<N;++i){
          for(int j=1;j<=K&&i+j<N;++j){
    	      cost[i+j]=Math.min(cost[i+j],cost[i]+Math.abs(H[i]-H[i+j]));
          }
      }
      System.out.println(cost[N-1]);
    }
}
