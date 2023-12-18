import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int[] a = new int[N];
    long m = 1;
    for (int i = 0; i < N; i++) {
      a[i] = scanner.nextInt();
      m *= a[i];
    }
    long d = 0;
    for (int i = 0; i < N; i++) {
      d += m / a[i];
    }

    System.out.println(m * 1.d / d);
  }
}
