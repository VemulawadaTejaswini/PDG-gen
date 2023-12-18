import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] p = new int[n];
    boolean ok = true;

    for (int i = 0; i < n; i++) {
      p[i] = sc.nextInt();
    }

    for (int i = 0; i < n; i++) {
      if (p[i] != (i + 1)) {
        if (ok) {
          int index = 0;
          for (int j = i + 1; j < n; j++) {
            if (p[j] == (i + 1)) {
              index = j;
              break;
            }
          }
          int tmp = p[i];
          p[i] = p[index];
          p[index] = tmp;
          ok = false;
        } else {
          System.out.println("NO");
          return;
        }
      }
    }

    System.out.println("YES");

  }
}