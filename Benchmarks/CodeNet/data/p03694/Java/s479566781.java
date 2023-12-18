import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    int ans = 0;

    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }

    Arrays.sort(a);

    for (int i = 0; i < (n - 1); i++) {
      ans += a[i + 1] - a[i];
    }

    System.out.println(ans);

  }
}