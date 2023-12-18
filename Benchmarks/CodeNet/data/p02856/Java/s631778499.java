import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();
    long keta = 0;
    long s = 0;
    for(int i = 0; i < m; i++) {
      long d = sc.nextLong();
      long c = sc.nextLong();
      keta += c;
      s += (d * c);
    }
    long ans = keta - 1 + (s - 1) / 9;
    System.out.println(ans);
  }
}
