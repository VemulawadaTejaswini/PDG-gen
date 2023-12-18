import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int M = scanner.nextInt();
    int[] a = new int[N];
    long sum = 0;
    for (int i = 0; i < N; i++) {
      a[i] = scanner.nextInt();
      sum += a[i];
    }
    int[][] b = new int[M][2];
    for (int i = 0; i < M; i++) b[i] = new int[] { scanner.nextInt(), scanner.nextInt() };

    Arrays.sort(a);
    Arrays.sort(b, Comparator.comparingInt(b2 -> -b2[1]));

    int i = 0;
    for (int j = 0; j < M && i < N; j++)
      for (int k = 0; k < b[j][0] && i < N && a[i] < b[j][1]; k++, i++) {
        sum -= a[i];
        sum += b[j][1];
      }
    System.out.println(sum);
  }
}
