
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];

    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }

    int min = a[0];
    for (int i = 1; i < n; i++) {
      min = Math.min(min, minValue(a[i], a[i - 1]));
    }

    System.out.println(min);
  }

  public static int minValue(int a, int b) {
    if (a == b) {
      return a;
    }
    if (a > b) {
      a = a % b;
      if (a == 0) {
        return b;
      }
    } else {
      b = b % a;
      if (b == 0) {
        return a;
      }
    }

    return minValue(a, b);
  }
}
