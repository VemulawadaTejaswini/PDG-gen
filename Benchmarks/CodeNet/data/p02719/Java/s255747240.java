import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    long K = sc.nextLong();
    sc.close();

    long mod = N % K;
    long ans = Math.min(mod, K - mod);
    System.out.println(ans);
  }
}