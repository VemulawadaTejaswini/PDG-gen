
import java.util.*;
import java.io.*;

public class Main {

	private static final int mod =(int)1e9+7;
	public static void main(String[] args) throws Exception  {
	      Scanner  sc=new Scanner(System.in);
	      PrintWriter out=new PrintWriter(System.out);
	    int n=sc.nextInt();
	    int m=sc.nextInt();
	    char[][] a=new char[n+3][m+3];
	    boolean[][] b=new boolean[n+3][m+3];
	    for(int i=2;i<=n+1;i++) {
	      char aa[]=sc.next().toCharArray();
	      for(int j=2;j<=m+1;j++) {
	        a[i][j]=aa[j-2];
	        b[i][j]=true;
	      }
	    }
	    for(int i=1;i<=n+2;i++) {
       for(int j=1;j<=m+2;j++) {
         if(b[i][j]==false)
         a[i][j]='#';
       }
     }
	    for(int i=1;i<=n+2;i++) {
       for(int j=1;j<=m+2;j++) {
        System.out.print(a[i][j]);
     }
       System.out.println();
}
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