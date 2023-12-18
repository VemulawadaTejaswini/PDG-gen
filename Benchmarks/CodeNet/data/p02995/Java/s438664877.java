import java.util.*;
public class Main{
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     long  a = sc.nextLong();
     long b = sc.nextLong();
     long  c = sc.nextLong();
     long d = sc.nextLong();
     long cd,x,y,z,ans;
     cd = lcm(c,d);
     x= b/c -(a-1)/c;
     y= b/d -(a-1)/d;
     z= b/cd -(a-1)/cd;
     ans= b-a+1-x-y+z;
     System.out.println(ans);
   }

   private static long gcd(long m, long n) {
       if(m < n) return gcd(n, m);
       if(n == 0) return m;
       return gcd(n, m % n);
   }

   private static long lcm(long m, long n) {
       return m * n / gcd(m, n);
   }
}
