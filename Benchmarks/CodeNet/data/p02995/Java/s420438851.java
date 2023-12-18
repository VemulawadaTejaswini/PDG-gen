import java.util.*;
class Main {
  public static int gcd(int m, int n) {
    if (m % n == 0) {
      return n;
    } else {
	  int remainder = m % n;
      return gcd(n, remainder);
    }
  }
  
  public static int findNum(int a, int b, int c, int d) {
    int lcm = c * d / gcd(c, d);
    
    int numOfC = b/c - ((a-1)/c);
    int numOfD = b/d - ((a-1)/d);
    int numOfLcm = b/lcm - ((a-1)/lcm);
    
    return (b-a+1) - (numOfC + numOfD - numOfLcm);
  }
  
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int a = Integer.parseInt(sc.next());
    int b = Integer.parseInt(sc.next());
    int c = Integer.parseInt(sc.next());
    int d = Integer.parseInt(sc.next());
    
    int result = findNum(a, b, c, d);
    System.out.println(result);
  }
}