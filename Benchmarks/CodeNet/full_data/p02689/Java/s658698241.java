import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[] h = new int[n];
    Set<Integer> goodH = new HashSet<>();
    Set<Integer> hasBridge = new HashSet<>();

    for (int i = 0; i < n; i++) {
      h[i] = sc.nextInt();
    }
    for (int j = 0; j < m; j++) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      if (h[a-1] > h[b-1]) {
        goodH.add(a);
        goodH.remove(b);
      } else if (h[a-1] < h[b-1]) {
        goodH.add(b);
        goodH.remove(a);
      } else {
        goodH.remove(a);
        goodH.remove(b);
      }
      hasBridge.add(a);
      hasBridge.add(b);
    }
    int noBridgeCount = 0;
    for (int i = 1; i <= n; i++) {
      if (!hasBridge.contains(i)) {
        noBridgeCount++;
      }
    }

    int result = goodH.size() + noBridgeCount;

    System.out.println(result);
  }
}
