import java.util.*;
import java.io.*;

public class Main {

	private static final int mod =(int)1e9+7;
	public static void main(String[] args) throws Exception  {
	      Scanner  sc=new Scanner(System.in);
	      PrintWriter out=new PrintWriter(System.out);
int n=sc.nextInt();
int m=sc.nextInt();
pair []aa=new pair[m];

for(int i=0;i<m;i++) {
  int x=sc.nextInt()-1;
  int y=sc.nextInt()-1;
  long c=sc.nextLong();
  c=-1l*c;
  pair p=new pair(x,y,c);
 aa[i]=p;
}
long dis[]=new long[n];

Arrays.fill(dis,Long.MAX_VALUE);
dis[0]=0;
for(int i=0;i<n;i++) {
  for(int j=0;j<m;j++) {
    int src=aa[j].src;
    int des=aa[j].des;
    long wt=aa[j].val;
    if(dis[src]!=Long.MAX_VALUE&&dis[des]>dis[src]+wt) {
      dis[des]=dis[src]+wt;
    }
  }
}
boolean negative[]=new boolean[n];
      for(int i=0;i<n;i++){
    for(int j=0;j<m;j++) {
      int src=aa[j].src;
      int des=aa[j].des;
      long wt=aa[j].val;
      if(dis[src]!=Long.MAX_VALUE&&dis[des]>dis[src]+wt) {
        dis[des]=dis[src]+wt;
        negative[des]=true;
        
      }
      if(negative[src]) {
        negative[des]=true;
      }
        
    }
      }

	System.out.println(negative[n-1]==true?"inf":-dis[n-1]);

}

	      static long gcd(long a, long b) 
	      { 
	          if (a == 0) 
	              return b; 
	          return gcd(b % a, a); 
	      } 

static long nCr(int n,int r) {
  int dp[][]=new int[2001][2001];
  for(int i=0;i<2001;i++) {
    dp[0][i]=0;
  }
  for(int i=0;i<2001;i++) {
    dp[i][0]=1;
  }
  for(int i=1;i<2001;i++) {
    for(int j=1;j<2001;j++) {
      if(i==j) {
        dp[i][j]=1;
      }else {
        dp[i][j]=dp[i-1][j-1]+dp[i][j-1];
      }
    }
  }
  return dp[n][r];
}


      
}
class pair {
  int src;
 int  des;
 long val;
  pair(int src,int des,long val){
    this.src=src;
    this.des=des;
    this.val=val;
    
  }

//  @Override
//  public int compareTo(pair o) {
//   
//    return this.wt-o.wt;
//  }
}
