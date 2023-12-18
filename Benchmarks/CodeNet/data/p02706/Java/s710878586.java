import java.math.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int[] A = new int[M];
    for (int i = 0; i < M; i++) A[i] = sc.nextInt();
    sc.close();

    long sum = 0;
    for (int i = 0; i < M; i++) sum += A[i];

    long ans = -1;
    if (sum <= N) ans = N - sum;
    System.out.println(ans);
  }
}
