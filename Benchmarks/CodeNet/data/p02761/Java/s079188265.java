
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();
    int[] num = new int[n];
    int res = 0;

    for (int i = 0; i < n; i++) {
      num[i] = -1;
    }

    for (int i = 0; i < m; i++) {
      int s = scanner.nextInt();
      int c = scanner.nextInt();

      if (num[s - 1] == -1) {
        num[s - 1] = c;
      } else if (num[s - 1] != c) {
        res = -1;
        break;
      }
    }

    if (res != -1) {
      if (n > 1 && num[0] == 0) {
        res = -1;
      } else {
        if(n > 1 && num[0] == -1) {
          num[0] = 1;
        }
        for (int i = 0; i < n; i++) {
          if (num[i] != -1) {
            res += num[i] * Math.pow(10, n - i -1);
          }
        }
      }
    }
    System.out.println(res);

  }
}

