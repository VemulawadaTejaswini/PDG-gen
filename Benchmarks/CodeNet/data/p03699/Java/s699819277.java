import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int[] a = new int[N];
    int max = 0;
    for (int i = 0; i < N; i++){
      a[i] = scanner.nextInt();
      max += a[i];
    }

    if (max % 10 != 0) {
      System.out.println(max);
      return;
    }

    Arrays.sort(a);
    for (int i = 0; i < N; i++) {
      if (a[i] % 10 != 0) {
        System.out.println(max - a[i]);
        return;
      }
    }
    System.out.println(0);
  }
}
