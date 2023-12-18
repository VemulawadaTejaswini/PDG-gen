import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    Num[] a = new Num[N];
    for (int i = 0; i < N; i++) a[i] = new Num(i, scanner.nextInt());

    Arrays.sort(a, Comparator.comparingInt(num -> num.val));
    int cnt = 0;
    for (int i = 0; i < N; i++) {
      cnt += Math.abs(a[i].pos - i) % 2;
    }
    System.out.println(cnt / 2);
  }

  private static class Num {
    private final int pos;
    private final int val;

    private Num(int pos, int val) {
      this.pos = pos;
      this.val = val;
    }
  }
}
