import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    Arrays.sort(a);

    int[] ctr = new int[1000001];

    for (int i = 0; i < n; i++) {
      for (int j = a[i]; j <= 1000000; j += a[i]) {
        if (j == a[i] && ctr[j] != 0) {
          ctr[j]++; break;
        }
        ctr[j]++;
      }
    }

    int result = 0;
    for (int i : a) {
      if (ctr[i] == 1) result++;
    }

    System.out.println(result);
  }
}
