import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long A = sc.nextLong();
    long B = sc.nextLong();
    long N = sc.nextLong();
    sc.close();

    long ans = N % B;
    if (ans == 0) N--;
    ans = (N % B) * A / B;

    System.out.println(ans);
  }
}
