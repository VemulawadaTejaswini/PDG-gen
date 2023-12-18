import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String s = sc.next();
    String t = sc.next();
    int ans = 2*N;
    for (int i = 0; i < N; i++) {
      String ss = s.substring(i, N);
      String tt = t.substring(0, N-i);
      if (ss.equals(tt)) {
        ans -= N-i;
      }
    }
    System.out.println(ans);
  }
}