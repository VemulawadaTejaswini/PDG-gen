import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int[] a = new int[N];
    for (int i = 0; i < N; i++) a[i] = scanner.nextInt();

    List<Number> tails = new ArrayList<>();
    for (int i = 0; i < N; i++) {
      if (tails.isEmpty() || tails.get(tails.size() - 1).num >= a[i]) {
        tails.add(new Number(a[i]));
      } else {
        Number num = lowerBound(tails, a[i]);
        num.num = a[i];
      }
    }
    System.out.println(tails.size());
  }

  private static Number lowerBound(List<Number> a, int k) {
    int left = -1;
    int right = a.size();
    while (right - left > 1) {
      int mid = (left + right) / 2;
      if (k > a.get(mid).num) {
        right = mid;
      } else {
        left = mid;
      }
    }
    if (right == a.size()) return null;
    return a.get(right);
  }

  private static class Number {
    private int num;
    public Number(int num) {
      this.num = num;
    }
  }
}
