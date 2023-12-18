import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    Set<Integer> set = new HashSet<>();
    for (int i = 0; i < K; i++) {
      int d = sc.nextInt();
      for (int j = 0; j < d; j++)
        set.add(sc.nextInt());
    }
    sc.close();

    int ans = N - set.size();
    System.out.println(ans);
  }
}
