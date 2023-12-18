import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    int cnt = 0;

    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }

    while (true) {
      boolean ok = true;

      for (int i = 0; i < n; i++) {
        if ((a[i] % 2) == 0) {
          a[i] /= 2;
        } else {
          ok = false;
          break;
        }
      }

      if (ok) {
        cnt++;
      } else {
        break;
      }
    }

    System.out.println(cnt);

  }
}