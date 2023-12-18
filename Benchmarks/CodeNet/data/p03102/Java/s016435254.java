import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();
    int c = scanner.nextInt();
    int[] b = new int[m];
    for (int i = 0; i < m; i++) {
      b[i] = scanner.nextInt();
    }
    int[] sum = new int[n];
    for (int i = 0; i < n; i++) {
      sum[i] = 0;
      for (int j = 0; j < m; j++) {
        sum[i] += scanner.nextInt() * b[j];
      }
    }

    int ans = 0;

    for (int i = 0; i < n; i++) {
      if (sum[i] + c > 0)
        ans++;
    }

    System.out.println(ans);

  }

}
