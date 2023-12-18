import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int q = sc.nextInt();
    int[] a = new int[n];
    Arrays.fill(a, k);

    for (int i = 0; i < q; i++) {
      int c = sc.nextInt();
      for (int j = 0; j < n; j++) {
        if (j != (c - 1)) {
          a[j]--;
        }
      }
    }

    for (int i = 0; i < n; i++) {
      if (a[i] > 0) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
    }

  }
}