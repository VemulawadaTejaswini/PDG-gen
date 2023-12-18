import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long a = Long.parseLong(sc.next());
    long b = Long.parseLong(sc.next());
    long c = Long.parseLong(sc.next());
    long d = Long.parseLong(sc.next());
	long ans = 0;
    
	long ndivc = b/c - a/c;
    long ndivd = b/d - a/d;
    
    if (c > d) {
      long tmp = c;
      c = d;
      d = tmp;
    }
    long lcm = c * d / gcd(c, d);
    long ndivlcm = b/lcm - a/lcm;
    
    ans = b - a + 1 - ndivc - ndivd + ndivlcm;
    
    System.out.println(ans);
    
  }
  
  public static long gcd(long a, long b) {
    if (b == 0) {
      return a;
    } else {
      return gcd(b,a%b);
    }
  }
}
