/* package codechef; // don't place package name! */
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		FastReader sc=new FastReader();
// 		constructST(a,n);RMQ(n, qs, qe)
        // sieveOfEratosthenes();
		int n = sc.nextInt();
		long dp1[] = new long[n], dp2[] = new long[n], dp3[] = new long[n];
		Arrays.fill(dp1, 0);
		Arrays.fill(dp2, 0);
		Arrays.fill(dp3, 0);
		
		for(int i = 0; i < n; i++) {
			long a = sc.nextLong(), b = sc.nextLong(), c = sc.nextLong();
			if(i == 0) {
				dp1[0] = a; 
				dp2[0] = b;
				dp3[0] = c;
			}else {
				dp1[i] = Math.max(dp1[i - 1], a + Math.max(dp2[i - 1], dp3[i - 1]));
				dp2[i] = Math.max(dp2[i - 1], b + Math.max(dp1[i - 1], dp3[i - 1]));
				dp3[i] = Math.max(dp3[i - 1], c + Math.max(dp2[i - 1], dp1[i - 1]));
			}
		}
		System.out.println(Math.max(dp1[n - 1], Math.max(dp2[n - 1], dp3[n - 1])));
	}
    static int lower_bound(ArrayList <Long> ar,long x){
	    int n=ar.size(),low=0,high=n-1,res=-1;
	    while(low<=high){
	    	int mid=(low+high)>>1;
         
	    	if(ar.get(mid) >= x){
	    		res=mid;
	    		high = mid - 1;
	    	}
	    	else 
	    		low = mid + 1;
	    }
	    return res;
	}
    static int upper_bound(int a[],int x){
         int n=a.length,low=0,high=n-1,res=-1;
         while(low<=high){
             int mid=(low+high)>>1;
             if(a[mid]<=x){
                 res=mid;
                 low = mid + 1;
             }
             else 
                 high = mid - 1;
         }
         return res;
     }
    //   static int MAX=1000001;boolean prime[] = new boolean[MAX]; 
      
    //   static void sieveOfEratosthenes() { 
    //       for(int m9=0;m9<MAX;m9++) prime[m9]=true;
    //     for(int p = 2; p*p <=n; p++) { 
    //         if(prime[p] == true) 
    //         { 
    //             // Update all multiples of p 
    //             for(int i = p*2; i <= n; i += p) 
    //                 prime[i] = false; 
    //         } 
    //     } 
    //   }
      
      static long modexpo(long x,long n,long m){
        if(n==0)
            return 1;
        else if(n%2==0)
            return (modexpo(((x%m)*(x%m))%m,n/2,m))%m;
        else
            return ((x%m)*((modexpo(((x%m)*(x%m))%m,(n-1)/2,m))%m))%m;
      } 
       static int gcd(int a,int b){
           if(b==0)
              return a;
           else 
              return gcd(b,a%b);
       }
       static long gcd(long a,long b){
           if(b==0)
              return a;
           else 
              return gcd(b,a%b);
       }
	 static class FastReader{
          BufferedReader in;
          StringTokenizer st;
          public FastReader(){
              in=new BufferedReader(new InputStreamReader(System.in));
          }
          String next(){
              while(st==null || !st.hasMoreElements()){
                  try{
                      st=new StringTokenizer(in.readLine());
                  }
                  catch(IOException e){
                      e.printStackTrace();
                  }
               }
               return st.nextToken();
            }
            int nextInt(){
                return Integer.parseInt(next());
            }
            long nextLong(){
                return Long.parseLong(next());
            }
            double nextDouble(){
                return Double.parseDouble(next());
            }
            String nextLine(){
            String str19 = "";
            try{
                str19 = in.readLine();
            }
            catch (IOException e){ 
                e.printStackTrace();
             }
            return str19;
        }
      }    
}
