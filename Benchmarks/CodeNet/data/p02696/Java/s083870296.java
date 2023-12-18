import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long A = sc.nextLong();
    long B = sc.nextLong();
    long N = sc.nextLong();
    sc.close();

    long n = 0;
    for (int i = 1; i <= N; i++)
      n = Long.max(n, i % B);
    long ans = n * A / B;

    System.out.println(ans);
  }
}
