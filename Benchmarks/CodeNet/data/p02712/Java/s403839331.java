import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long ans = 0;
    for(long i = 1; i <= n; i++) {
      if(((i % 3) != 0) && ((i % 5) != 0)) ans += i;
    }
    System.out.println(ans);
  }
}