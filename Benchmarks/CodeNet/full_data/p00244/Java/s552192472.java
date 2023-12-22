import java.util.*;

public class Main {
  // constant

  static final int MAX_INT = (1 << 30);

  // inner classes

  static class State {
    int id, rem;

    State(int id, int rem) {
      this.id = id;
      this.rem = rem;
    }
  }

  // main
  public static final void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);

    while (true) {
      int n = sc.nextInt();
      int m = sc.nextInt();
      if (n == 0 && m == 0) break;

      int[][] edges = new int[n][n];
      for (int i = 0; i < n; i++)
        for (int j = 0; j < n; j++) edges[i][j] = 0;

      for (int i = 0; i < m; i++) {
        int a = sc.nextInt() - 1;
        int b = sc.nextInt() - 1;
        int c = sc.nextInt();

        edges[a][b] = edges[b][a] = c;
      }

      int start = 0;
      int goal = n - 1;

      int[][] dists = new int[n][3];
      boolean[][] used = new boolean[n][3];

      for (int i = 0; i < n; i++)
        for (int j = 0; j < 3; j++) {
          dists[i][j] = MAX_INT;
          used[i][j] = false;
        }

      dists[start][2] = 0;
      used[start][2] = true;

      ArrayList<State> q = new ArrayList<State>();
      q.add(new State(0, 2));

      while (! q.isEmpty()) {
        State u = q.get(0);
        for (int i = 1; i < q.size(); i++) {
          State ui = q.get(i);
          if (dists[u.id][u.rem] > dists[ui.id][ui.rem])
            u = ui;
        }

        q.remove(u);

        int uid = u.id;
        int urem = u.rem;

        if (uid == goal) continue;

        for (int vid = 0; vid < n; vid++) {
          if (edges[uid][vid] > 0) {
            if (urem != 1) {
              if (dists[vid][urem] > dists[uid][urem] + edges[uid][vid]) {
                dists[vid][urem] = dists[uid][urem] + edges[uid][vid];
                if (! used[vid][urem]) {
                  used[vid][urem] = true;
                  q.add(new State(vid, urem));
                }
              }
            }

            if (urem > 0) {
              int vrem = urem - 1;
              if (dists[vid][vrem] > dists[uid][urem]) {
                dists[vid][vrem] = dists[uid][urem];
                if (! used[vid][vrem]) {
                  used[vid][vrem] = true;
                  q.add(new State(vid, vrem));
                }
              }
            }
          }
        }
      }

      int d0 = dists[goal][0];
      int d2 = dists[goal][2];

      System.out.println(d0 < d2 ? d0 : d2);
    }
  }
}