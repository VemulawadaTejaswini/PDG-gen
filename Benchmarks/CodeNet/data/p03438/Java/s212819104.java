import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int[] a = new int[N];
    int[] b = new int[N];

    for (int i = 0; i < N; i++) {
      a[i] = scanner.nextInt();
    }

    for (int i = 0; i < N; i++) {
      b[i] = scanner.nextInt();
    }

    new Main().execute(N, a, b);
  }

  public void execute(int N, int[] a, int[] b) {

    for (int i = 0; i < N - 1; i++) {
      if (a[i] > b[i]) {
        while (a[i] > b[i]) {
          a[i + 1] += 2;
          b[i] += 1;
        }
      } else if (a[i] == b[i]) {
        continue;
      } else {
        // a[i] < b[i]
        while (a[i] < b[i]) {
          if (a[i] + 1 == b[i]) {
            a[i] += 2;
            b[i] += 1;
          } else {
            a[i] += 2;
            b[i + 1] += 1;
          }
        }
      }
    }

    System.out.println(a[N - 1] == b[N - 1] ? "Yes" : "No");

  }

}
