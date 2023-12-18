
import java.util.*;
import java.io.*;

public class Main {

	private static final int mod =(int)1e9+7;
	public static void main(String[] args) throws Exception  {
	      Scanner  sc=new Scanner(System.in);
	      PrintWriter out=new PrintWriter(System.out);
	        ArrayList<Integer> a=new ArrayList<>();
	        a.add(1);
	        a.add(3);
	        a.add(5);
	        a.add(7);
	        a.add(8);
	        a.add(10);
	        a.add(12);
	        ArrayList<Integer> b=new ArrayList<>();
	        ArrayList<Integer> c=new ArrayList<>();
b.add(4);
b.add(6);
b.add(9);
b.add(11);
c.add(2);
int x=sc.nextInt();
int y=sc.nextInt();
if((a.contains(x)&&a.contains(y))||(b.contains(x)&&b.contains(y))||(c.contains(x)&&c.contains(y))){
 System.out.println("Yes"); 
}else {
  System.out.println("No");
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