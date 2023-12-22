import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
        a[i] = sc.nextInt();
    }

    int min = 1000000;
    int max = -1000000;
    long total = 0;
    for (int i = 0; i < n; i++) {
        min = Math.min(min, a[i]);
        max = Math.max(max, a[i]);
        total += a[i];
    }

    System.out.printf("%d %d %d\n", min, max, total);
  }
}
