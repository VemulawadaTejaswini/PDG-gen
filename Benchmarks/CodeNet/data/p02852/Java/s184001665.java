import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out, true);
    StringTokenizer st = new StringTokenizer(in.readLine());
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    String S = in.readLine().trim();
    ArrayDeque<Pair<Integer, Integer>> q = new ArrayDeque<>();
    q.add(new Pair(N, 0));
    ArrayList<Integer> bp = new ArrayList<>(Collections.nCopies(N + 1, -1));
    for (int i = N - 1; i >= 0; --i) {
      while (!q.isEmpty() && q.peekLast().x - i > M) q.removeLast();
      if (q.isEmpty() || S.charAt(i) == '1') continue;
      Pair<Integer, Integer> p = new Pair<>(i, q.peekLast().y + 1);
      bp.set(i, q.peekLast().x);
      while (!q.isEmpty() && q.peekFirst().y >= p.y) q.removeFirst();
      q.addFirst(p);
    }
    if (bp.get(0) == -1) {
      out.println(-1);
      return;
    }
    int i = 0;
    while (bp.get(i) != -1) {
      out.print(bp.get(i) - i);
      out.print(" ");
      i = bp.get(i);
    }
    out.println();
  }

  static class Pair<X, Y> {
    X x;
    Y y;

    Pair(X x, Y y) {
      this.x = x;
      this.y = y;
    }
  }
}
