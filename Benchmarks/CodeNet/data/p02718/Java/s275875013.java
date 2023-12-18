import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int sum = 0;
    int ans = 0;
    int x = (4 * M);
    int A[] = new int[N];
    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
      sum = sum + A[i];
    }
    for (int i = 0; i < N; i++) {
      if (A[i] >= sum / x) {
        ans++;
      }
    }

    if (ans >= M) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}