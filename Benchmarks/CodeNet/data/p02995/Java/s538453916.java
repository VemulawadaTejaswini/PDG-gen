import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    long A = Long.parseLong(sc.next());
    long B = Long.parseLong(sc.next());
    long C = Long.parseLong(sc.next());
    long D = Long.parseLong(sc.next());
    long K = lcm(C, D);
    
    long a = B/C;
    long b = (A-1)/C;
    long ab = a-b;
    
    long c = B/D;
    long d = (A-1)/D;
    long cd = c-d;
    
    long e = B/K;
    long f = (A-1)/K;
    long ef = e-f;
    
    long g = ab+cd-ef;
    long ans = B-A-g+1;
      
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