import java.util.*;
import java.util.TreeMap;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int cnt = 1;
    int max = sc.nextInt();
    for (int i = 0; i < N; i++) {
      int next = sc.nextInt();
      max = Math.max(max, next);
      if (max > next) {
        cnt++;
      }
    }
    System.out.println(cnt);
  }
}
