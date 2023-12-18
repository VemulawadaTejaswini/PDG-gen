import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    
    long ans = 0;
    int bit = 1 << S.length()-1;
    for (int i = 0; i < bit; i++) {
      ans += solve(S, i);
    }
    
    System.out.println(ans);
  }
  
  private static long solve(String s, int bit) {
    long sum = 0;
    long a = 0;
    for (int i = 0; i < s.length(); i++) {
      a = a*10 + (s.charAt(i)-'0');
      if ((bit>>i)%2 == 1) {
        sum += a;
        a = 0;
      }
    }
    sum += a;
    return sum;
  }
}