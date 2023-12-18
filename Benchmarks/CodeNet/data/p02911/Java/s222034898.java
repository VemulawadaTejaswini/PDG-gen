import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int Q = sc.nextInt();

    int[] p = new int[N+1];
    for (int i = 0; i < Q; i++) {
      int A = sc.nextInt();
      p[A]++;
    }
    for (int i = 1; i <= N; i++) {
      System.out.println(p[i]-Q+K > 0 ? "Yes" : "No");
    }
  }
}