import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int ans = 0;
    int prev = 0;
    int len = 1;
    for (int i = 0; i < N; i++) {
      int a = sc.nextInt();
      if (prev == a) {
        len++;
      } else {
        ans += len/2;
        len = 1;
      }
      prev = a;
    }
    ans += len/2;
    System.out.println(ans);
  }
}