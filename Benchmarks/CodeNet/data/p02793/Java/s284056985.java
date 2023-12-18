import java.util.*;
public class Main { 
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       long o=0;
       int n=sc.nextInt();
       long g=1;
       long[] a=new long[n];
       for(int i=0;i<n;i++){
         a[i]=sc.nextLong();
         g=lcm(a[i],g);
       }
       long b=0;
       for(int i=0;i<n;i++){
         long bi=g/a[i];
         b+=bi;
         b%=1000000007;
       }
       o=b%1000000007;
      System.out.println(o);
    }
  
 static long lcm (long a, long b) {
	long temp;
	long c = a;
	c *= b;
	while((temp = a%b)!=0) {
		a = b;
		b = temp;
	}
	return (long)(c/b);
}
}