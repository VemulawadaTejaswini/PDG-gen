import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long ua = a - 1;
    long b = sc.nextLong();
    long c = sc.nextLong();
    long d = sc.nextLong();
    long lcm = lcm(c, d);

    long count = 0;
    
    long cCMsCount = b / c - ua / c;
    long dCMsCount = b / d - ua / d;
    long lcmCMsCount = b / lcm - ua / lcm;
    
    long wholeCMsCount = cCMsCount + dCMsCount - lcmCMsCount;
    count = b - a + 1 - wholeCMsCount;
    
//    System.out.println(cCMsCount);
//    System.out.println(dCMsCount);
//    System.out.println(lcmCMsCount);
//    System.out.println(wholeCMsCount);
    System.out.println(count);
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
