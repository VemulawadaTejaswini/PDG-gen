
import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    int h[] = new int[n];
    boolean fix[] = new boolean[n];
    Arrays.fill(fix, false);
    for (int i = 0; i < n; i++) {
      h[i] = sc.nextInt();
    }

    for (int i = 0; i < n - 1; i++) {
      int sabun = h[i] - h[i + 1];

      if (sabun >= 2) {
        System.out.println("No");
        return;
      }

      if (sabun == 1 && fix[i]) {
        System.out.println("No");
        return;
      }

      if (sabun == 1 && !fix[i + 1]) {
        fix[i + 1] = true;
      }
    }
    System.out.println("Yes");
  }
}
