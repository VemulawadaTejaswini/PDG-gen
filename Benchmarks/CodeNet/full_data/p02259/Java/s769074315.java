import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n;
    n = sc.nextInt();

    int a[] = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }

    func(a);

    sc.close();
  }

  private static void func(int a[]) {// バブルソート
    int times = 0, copy;

    // バブルソート
    for (int i = a.length; i > 0; i--) {
      for (int j = 0; j < i - 1; j++) {
        if (a[j] > a[j+1]) {
          copy = a[j+1];
          a[j+1] = a[j];
          a[j] = copy;
          times++;
        }
      }
    }

    // 回答
    for (int i = 0; i < a.length - 1; i++) {
      System.out.printf("%d ", a[i]);
    }
    System.out.printf("%d\n%d\n", a[a.length - 1], times);
  }
}

