
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int q = sc.nextInt();

    int p[] = new int[n];
    for (int i = 0; i < n; i++) {
      p[i] = k;
    }
    for (int i = 0; i < q; i++) {
      int ans = sc.nextInt();
      for (int j = 0; j < n; j++) {
        if (ans != j + 1) {
          p[j] = p[j] - 1;
        }
      }
    }

    for (int i = 0; i < n; i++) {
      if(p[i] > 0) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }

    }
  }
}