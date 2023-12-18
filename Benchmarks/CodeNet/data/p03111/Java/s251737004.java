import java.util.Scanner;

public class Main {
  static int[] l;
  static int min = 1000000000;
  static int N, A, B, C;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    N = sc.nextInt();
    A = sc.nextInt();
    B = sc.nextInt();
    C = sc.nextInt();
    l = new int[N];
    for (int i = 0; i < N; i++) {
      l[i] = sc.nextInt();
    }
    sc.close();
    dfs(0, 0, 0, 0, 0);
    System.out.println(min);
  }

  static void dfs(int n, int a, int b, int c, int d) {
    if (n == N) {
      System.out.println("n:" + n + " " + "a:" + a + " " + "b:" + b + " " + "c:" + c + " " + "d:" + d);
      if (a == 0 || b == 0 || c == 0) {
        return;
      }
      int cost = Math.abs(A - a) + Math.abs(B - b) + Math.abs(C - c);
      cost += d - 30;
      min = Math.min(min, cost);
      return;
    }
    System.out.println("n:" + n + " " + "a:" + a + " " + "b:" + b + " " + "c:" + c + " " + "d:" + d);
    dfs(n + 1, a, b, c, d);
    dfs(n + 1, a + l[n], b, c, d + 10);
    dfs(n + 1, a, b + l[n], c, d + 10);
    dfs(n + 1, a, b, c + l[n], d + 10);
  }
}