import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int[] A = new int[N * 3];
    for (int i = 0; i < N * 3; i++) A[i] = scanner.nextInt();
    Arrays.sort(A);
    reverse(A);

    long res = 0;
    for (int i = 1; i < N * 2; i += 2) res += A[i];
    System.out.println(res);
  }

  private static void reverse(int[] a) {
    int i = 0;
    int j = a.length - 1;
    while (i < j) {
      int tmp = a[i];
      a[i] = a[j];
      a[j] = tmp;
      i++;
      j--;
    }
  }
}
