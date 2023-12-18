import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long A = sc.nextLong();
    long B = sc.nextLong();
    long N = sc.nextLong();
    sc.close();

    if (N % B == 0 && 1 < N) N--;
    long ans = (N % B) * A / B;

    System.out.println(ans);
  }
}
