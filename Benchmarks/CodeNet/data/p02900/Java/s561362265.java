import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long a = Long.parseLong(sc.next());
    long b = Long.parseLong(sc.next());
    long num, count = 1;
    if(a > b) num = gcd(a, b);
    else num = gcd(b, a);
    for(int i = 2; i <= Math.sqrt(num); i++) {
      if(num % i != 0) continue;
      count++;
      while(num % i == 0) {
        num /= i;
      }
    }
    System.out.println(count);
  }

  public static long gcd(long a, long b) {
    if(b == 0) return a;
    return gcd(b, a % b);
  }
}
