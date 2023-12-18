import java.util.*;
import java.util.stream.*;

public class Main {
  static int A, B, C;

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int N = in.nextInt();
    A = in.nextInt();
    B = in.nextInt();
    C = in.nextInt();
    int[] l = new int[N];
    for (int i = 0; i < N; i++) {
      l[i] = in.nextInt();
    }
    System.out.println(dfs(l, 0, 0, 0, 0));
  }

  public static int dfs(int[] arr, int depth, int a, int b, int c) {
    return depth == arr.length
        ? IntStream.of(a, b, c).min().getAsInt() > 0 
          ? Math.abs(a - A) + Math.abs(b - B) + Math.abs(c - C) - 30
          : Integer.MAX_VALUE / 2
        : IntStream.of(
          dfs(arr, depth + 1, a, b, c),
          dfs(arr, depth + 1, a + arr[depth], b, c) + 10,
          dfs(arr, depth + 1, a, b + arr[depth], c) + 10,
          dfs(arr, depth + 1, a, b, c + arr[depth]) + 10
        ).min().getAsInt();
  }
}