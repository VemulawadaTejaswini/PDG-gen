
import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ
    // TODO 自動生成されたメソッド・スタブ
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int p[] = new int[n];
    int q[] = new int[n];

    int p_order = 0;
    int q_order = 0;

    for (int i = 0; i < n; i++) {
      p[i] = sc.nextInt();
    }

    for (int i = 0; i < n; i++) {
      q[i] = sc.nextInt();
    }

    int pos = 0;
    for (int i = 0; i < n; i++) {
      pos += (index(p[i], Arrays.copyOfRange(p, i, n)) - 1) * kaijyo(n - i - 1);
    }

    int q_pos = 0;
    for (int i = 0; i < n; i++) {
      q_pos += (index(q[i], Arrays.copyOfRange(q, i, n)) - 1) * kaijyo(n - i - 1);
    }
    System.out.println(Math.abs((pos + 1) - (q_pos + 1)));
  }

  public static int index(int i, int list[]) {
    int a = 1;
    for (int j = 0; j < list.length; j++) {
      if (list[j] < i) {
        a++;
      }
    }
    return a;
  }

  public static int kaijyo(int i) {
    if (i == 0) {
      return 1;
    }
    return i * kaijyo(i - 1);
  }
}
