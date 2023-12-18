import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    long n = sc.nextLong();

    long ans = 0;
    LABEL:for (long i = 2; i < n; i++) {
      for (long j = 1; j < n; j++) {
        if (i * j == n) {
          ans = i + j - 2;
          break LABEL;
        }
      }
    }
    
    System.out.println(ans);
  }
}
