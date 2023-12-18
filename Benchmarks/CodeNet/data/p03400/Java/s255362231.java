import java.util.*;
import java.util.TreeMap;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int D = sc.nextInt();
    int X = sc.nextInt();
    int cnt = N;
    for (int i = 0; i < N; i++) {
      int j = 1;
      int val = 0;
      int num = sc.nextInt();
      val = j * num + 1;
      while (val <= D) {
        cnt++;
        j++;
        val = j * num + 1;
      }
    }
    System.out.println(cnt + X);
  }
}
