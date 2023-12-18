import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);

    int N = Integer.parseInt(br.readLine());
    int[][] E0 = new int[N - 1][2];
    ArrayList<ArrayList<Integer>> E = new ArrayList<>(N);
    for (int u = 0; u < N; ++u) E.add(new ArrayList<>());
    for (int i = 0; i < N - 1; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int u = Integer.parseInt(st.nextToken()) - 1, v = Integer.parseInt(st.nextToken()) - 1;
      E0[i][0] = u;
      E0[i][1] = v;
      E.get(u).add(2*i);
      E.get(v).add(2*i + 1);
    }

    int[] col = new int[N - 1];
    Arrays.fill(col, -1);

    go(0, -1, -1, E, E0, col);

    int K = 0;
    for (int c : col) K = Math.max(K, c + 1);
    pw.println(K);
    for (int i = 0; i < N - 1; i++) {
      pw.println(col[i] + 1);
    }
    pw.flush();
  }

  static void go(int u, int p, int pcol, ArrayList<ArrayList<Integer>> E, int[][] E0, int[] col) {
    int cur = 0;
    for (int i : E.get(u)) {
      int v = E0[i / 2][1 ^ (i % 2)];
      if (v == p) continue;
      if (cur == pcol) ++cur;
      col[i / 2] = cur;
      go(v, u, cur, E, E0, col);
      ++cur;
    }
  }
}
