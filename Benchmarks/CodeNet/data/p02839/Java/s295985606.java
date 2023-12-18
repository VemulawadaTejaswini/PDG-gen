import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out, true);

    StringTokenizer st = new StringTokenizer(br.readLine());
    int H = Integer.parseInt(st.nextToken()), W = Integer.parseInt(st.nextToken());
    int[][] A = read2DArray(br, H, W);
    int[][] B = read2DArray(br, H, W);

    ArrayList<List<HashSet<Integer>>> DP = new ArrayList<>();
    for (int r = 0; r < H; ++r) {
      DP.add(new ArrayList<>());
      for (int c  = 0; c < W; ++c) {
        DP.get(r).add(new HashSet<>());
      }
    }
    DP.get(0).get(0).add(A[0][0] - B[0][0]);
    DP.get(0).get(0).add(B[0][0] - A[0][0]);
    for (int r = 0; r < H; ++r) {
      for (int c = 0; c < W; ++c) {
        int[] diffs = new int[2];
        diffs[0] = A[r][c] - B[r][c];
        diffs[1] = -diffs[0];
        if (c - 1 >= 0) {
          for (int prev : DP.get(r).get(c - 1)) {
            for (int diff : diffs) {
              DP.get(r).get(c).add(prev + diff);
            }
          }
        }
        if (r - 1 >= 0) {
          for (int prev : DP.get(r - 1).get(c)) {
            for (int diff : diffs) {
              DP.get(r).get(c).add(prev + diff);
            }
          }
        }
      }
    }

    int ans = 1000000;
    for (int val : DP.get(H - 1).get(W - 1)) {
      ans = Math.min(ans, Math.abs(val));
    }
    pw.println(ans);
  }

  private static int[][] read2DArray(BufferedReader br, int h, int w) throws IOException {
    StringTokenizer st;
    int[][] dat = new int[h][w];
    for (int r = 0; r < h; ++r) {
      st = new StringTokenizer(br.readLine());
      for (int c = 0; c < w; ++c) {
        dat[r][c] = Integer.parseInt(st.nextToken());
      }
    }
    return dat;
  }
}
