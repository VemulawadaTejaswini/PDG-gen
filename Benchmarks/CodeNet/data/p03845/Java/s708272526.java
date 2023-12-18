import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] T = new int[N+1];
    int sum = 0;
    for (int i = 1; i <= N; i++) {
      T[i] = sc.nextInt();
      sum += T[i];
    }
    int M = sc.nextInt();
    for (int i = 0; i < M; i++) {
      int P = sc.nextInt();
      int X = sc.nextInt();
      System.out.println(sum - T[P] + X);
    }
  }
}