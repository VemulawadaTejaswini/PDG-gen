import java.util.Arrays;
import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = Integer.parseInt(scanner.next());
    long[] A = new long[N];
    for (int i = 0; i < N; i++) {
      A[i] = Long.parseLong(scanner.next()) - i;
    }
    Arrays.sort(A);
    long ans = 0;
    for (int i = 0; i < N / 2; i++) {
      ans += A[N / 2] - A[i];
    }
    for (int i = N / 2; i < N; i++) {
      ans += A[i] - A[N / 2];
    }
    System.out.println(ans);
  }

}
