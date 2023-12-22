import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();
    int m = scan.nextInt();

    int[] h = new int[n];
    for (int i = 0; i < n; i++) {
      h[i] = scan.nextInt();
    }

    boolean[] res = new boolean[n];
    for (int i = 0; i < n; i++) {
      res[i] = true;
    }

    for (int i = 0; i < m; i++) {
      int a = scan.nextInt();
      int b = scan.nextInt();
      a--;
      b--;
      if (h[a] > h[b]) {
        res[b] = false;
      } else if (h[a] < h[b]) {
        res[a] = false;
      } else {
        res[a] = false;
        res[b] = false;
      }
    }

    int cnt = 0;
    for (int i = 0; i < n; i++) {
      if (res[i] == true) {
        cnt++;
      }
    }

    System.out.println(cnt);

  }

}