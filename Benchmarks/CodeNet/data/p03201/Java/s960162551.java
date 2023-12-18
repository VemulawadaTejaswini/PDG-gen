import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < N; i++) list.add(scanner.nextInt());

    Collections.sort(list);
    int cnt = 0;
    while (!list.isEmpty()) {
      int a = list.remove(list.size() - 1);
      int b = (Integer.highestOneBit(a) << 1) - a;
      int j = upperBound(list, -1, list.size(), b);
      if (j >= 0 && list.get(j) == b) {
        list.remove(j);
        cnt++;
      }
    }
    System.out.println(cnt);
  }

  public static int upperBound(List<Integer> a, int left, int right, int k) {
    while (right - left > 1) {
      int mid = (left + right) / 2;
      if (a.get(mid) <= k) {
        left = mid;
      } else {
        right = mid;
      }
    }
    return left;
  }
}
