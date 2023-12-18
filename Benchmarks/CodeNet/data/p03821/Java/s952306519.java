import java.util.Scanner;

public class Main {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int N = sc.nextInt();
    long[] A = new long[N];
    long[] B = new long[N];
    for (int i = 0; i < N; i++) {
      A[i] = Long.parseLong(sc.next());
      B[i] = Long.parseLong(sc.next());
    }
    long ans = 0;
    for (int i = N - 1; i >= 0; i--) {
      long cur = A[i] + ans;
      ans += (cur + B[i] - 1) / B[i] * B[i] - cur;
    }
    System.out.println(ans);
  }

}
