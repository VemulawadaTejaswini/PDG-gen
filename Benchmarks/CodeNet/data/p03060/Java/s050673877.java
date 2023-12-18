import java.util.Scanner;

import java.lang.Math;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N;
    N = scanner.nextInt();
    int[] V = new int[N];
    int[] C = new int[N];
    for (int i = 0; i < N; i++)
      V[i] = scanner.nextInt();
    for (int i = 0; i < N; i++)
      C[i] = scanner.nextInt();

    int ans = 0;
    for (int i = 0; i < N; i++)
      ans += Math.max(0, V[i] - C[i]);

    System.out.println(ans);
  }
}
