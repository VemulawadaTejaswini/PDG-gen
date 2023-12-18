import java.util.*;
import java.util.stream.*;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int N = in.nextInt();
    int ans = 0;
    for (int i = 1; i <= N; i++) {
      if (String.valueOf(i).length() % 2 == 1) {
        ans++;
      }
    }
    System.out.println(ans);
  }
}