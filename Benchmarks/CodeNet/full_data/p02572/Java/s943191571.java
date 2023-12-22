import java.io.*;
import java.util.*;

public class Main {
  private static final int MOD = 1000000007;

  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(in.readLine());
    int[] A = new int[N];
    StringTokenizer st = new StringTokenizer(in.readLine());
    for (int i = 0; i < N; ++i) {
      A[i] = Integer.parseInt(st.nextToken());
    }

    System.out.println(solve(N, A));

    in.close();
  }

  private static int solve(int N, int[] A) {
    long sum = A[0];
    int result = 0;

    for (int i = 1; i < N; ++i) {
      result = (int) ((result + (sum * A[i]) % MOD) % MOD);
      sum += A[i];
    }

    return result;
  }
}