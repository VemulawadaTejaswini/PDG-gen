
import java.util.*;
import java.io.*;

public class Main{

	private static final int mod =(int)1e9+7;
	public static void main(String[] args) throws Exception  {
	      Scanner  sc=new Scanner(System.in);
	      PrintWriter out=new PrintWriter(System.out);
	        int n=sc.nextInt();
	       long a[]=new long[3*n];
	        for(int i=0;i<3*n;i++) {
	          a[i]=sc.nextLong();  
	        }
	        long ans=Long.MIN_VALUE;
	        PriorityQueue<Long> pq=new PriorityQueue<>();
	        long sum[]=new long[n+1];
	        long sum2[]=new long[n+1];
	        long summ=0;
	        for(int i=0;i<n;i++) {
	          pq.add(a[i]);
	          summ+=a[i];
	          
	        }
	       sum[0]=summ;
	        for(int i=n;i<2*n;i++) {
	          if(a[i]>pq.peek()) {
	           summ-= pq.poll();
	            pq.add(a[i]);
	            summ+=a[i];
	            sum[i-n+1]=summ;
	          }else {
	            sum[i-n+1]=sum[i-n];
	          }
	        }
	        PriorityQueue<Long> pq1=new PriorityQueue<>(Collections.reverseOrder());
	         summ=0;
         for(int i=3*n-1;i>=2*n;i--) {
           pq1.add(a[i]);
           summ+=a[i];
           
         }
         sum2[n]=summ;
         for(int i=2*n-1;i>=n;i--) {
           if(a[i]<pq1.peek()) {
            summ-= pq1.poll();
             pq1.add(a[i]);
             summ+=a[i];
             sum2[i-n]=summ;
           }else {
             sum2[i-n]=sum2[i-n+1];
           }
         }
         
         for(int i=1;i<=n;i++) {
           ans=Math.max(sum[i]-sum2[i],ans);
         }
         
	        System.out.println(ans);
	}
	static long solve(PriorityQueue<Long> pq) {
	  
	  long sum=0;
	    
	       while(!pq.isEmpty()) {
	         sum+=pq.poll();
	       
	       }
	       return sum;
	}
 static long solve1(long a[],int i,int j,int n) {
   
   PriorityQueue<Long> pq=new PriorityQueue<>();
   for(int k=i;k<j;k++) {
   
     pq.add(a[k]);
   }
   
   long sum=0;
  while(n!=0) {
    sum+=pq.poll();
    n--;
  }
  return sum;
}
	
	static int  prime[]=new int[100001];
	static void sieve() {
	  Arrays.fill(prime,1);
	  prime[0]=0;
	  prime[1]=1;
	  for(int i=2;i*i<100001;i++) {
	   if(prime[i]!=0) {
	     for(int j=i;j<10001;j+=i) {
	       prime[j]=0;
	     }
	   }
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