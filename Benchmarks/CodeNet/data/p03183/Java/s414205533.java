import java.util.*;
public class Main {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
		 int n=in.nextInt();
		 ArrayList<Long>[] g=new ArrayList[20001];
		 for (int i=0;i<20001;++i)
		     g[i]=new ArrayList<Long>();
		 for (int i=0;i<n;++i) {
		     int w=in.nextInt();
			 int s=in.nextInt();
			 long v=in.nextLong();
			 g[w+s].add(v*20000+s);
		 }
		 long[] dp=new long[20001];
		 for (int i=0;i<20001;++i) {
		     for (int j=0;j<g[i].size();++j) {
			 	 long tmp=g[i].get(j);
				 long v=tmp/20000;
				 int s=(int)(tmp%20000);
				 int w=i-s;
				 for (int k=s;k>=0;--k)
				     dp[k+w]=Math.max(dp[k+w],dp[k]+v);
			 }
		 }
		 long res=0;
		 for (int i=0;i<20001;++i)
		     res=Math.max(res,dp[i]);
	     System.out.println(res);
    }
}
