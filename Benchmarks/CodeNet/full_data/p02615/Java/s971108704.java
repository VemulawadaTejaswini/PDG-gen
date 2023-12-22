import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[] a = new long[n];
    long sum = 0;

    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }

    Arrays.sort(a);

    for (int i = 1; i < n; i++) {
      sum += a[i];
    }

    System.out.println(sum);

  }
}