import java.util.*;
public class Main { 
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       long o=0;
       long n=sc.nextLong();
       long m=sc.nextLong();
       long[] a=new long[(int)n];
       for(int i=0;i<n;i++){
       	a[i]=sc.nextLong()/2;
       }
      long sk=a[0];
      for(int i=1;i<n;i++){
      	long g=lcm(sk,a[i]);
        if((g/sk)%2==(g/a[i])%2){
          sk=Math.max(g,sk);
        }else{
        	System.out.println(0);
          	return;
        }
      }
      
      o=(long)Math.ceil((double)m/((double)sk*2)) ;
      System.out.println(o);
    }
  
  private static long lcm(long m, long n) {
    return m * n / gcd(m, n);
  }
  private static long gcd(long m, long n) {
    if(m < n) return gcd(n, m);
    if(n == 0) return m;
    return gcd(n, m % n);
  }
}