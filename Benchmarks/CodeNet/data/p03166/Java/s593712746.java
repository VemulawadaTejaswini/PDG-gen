import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args){
		new Main().run();
    }

    void run(){
      Scanner sc=new Scanner(System.in);
      int N=sc.nextInt();
      int M=sc.nextInt();
      ArrayList<Integer>[] g=new ArrayList[N];
      for(int i=0;i<N;++i){
          g[i]=new ArrayList<>();
      }
      boolean[] valid=new boolean[N];
      Arrays.fill(valid,true);
      int[] in=new int[N];
      int[] out=new int[N];
      for(int i=0;i<M;++i){
          int x=sc.nextInt();
          int y=sc.nextInt();
          --x;
          --y;
          g[x].add(y);
          ++in[y];
          ++out[x];
      }
      ArrayDeque<Integer> pend=new ArrayDeque<>();
      for(int i=0;i<N;++i){
          if(in[i]==0)pend.add(i);
      }
      int[] dp=new int[N];
      while(!pend.isEmpty()){
          int src=pend.poll();
          for(int dst:g[src]){
            dp[dst]=Math.max(dp[dst],dp[src]+1);
            --in[dst];
            if(in[dst]==0){
                pend.add(dst);
            }
	    }
	}
	int ans=0;
	for(int v:dp)ans=Math.max(ans,v);
      System.out.println(ans);
    }

    void tr(Object...o){System.out.println(Arrays.deepToString(o));}
}
