import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int[] a = new int[n + 1];
    int[] b = new int[n];

    int res = 0;

    for (int i = 0; i <= n; i++)
      a[i] = sc.nextInt();
    for (int i = 0; i < n; i++) {
      b[i] = sc.nextInt();
      if (b[i] > a[i]) {
        res += a[i];
        int carry = Math.min(a[i + 1], b[i] - a[i]);
        a[i + 1] -= carry;
        res += carry;
      } else
        res += b[i];
    }

    System.out.println(res);
  }
}