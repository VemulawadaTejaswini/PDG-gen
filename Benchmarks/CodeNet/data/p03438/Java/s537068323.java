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
      int diff = a[i] - b[i];
      if (diff > 0) {
        a[i + 1] += 2 * diff;
        b[i] += diff;
      } else if (diff == 0) {
        continue;
      } else {
        // a[i] < b[i]
        diff = -diff / 2;
        a[i] += 2 * diff;
        b[i+1] += diff;
        if(a[i] < b[i]) {
          a[i] += 2;
          b[i] += 1;
        }
      }
    }

    int lastDiff = b[N-1] - a[N-1];
    System.out.println(lastDiff >= 0 ? "Yes" : "No");
  }

}
