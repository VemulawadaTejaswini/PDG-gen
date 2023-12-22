import java.util.*;

public class Main {
  // constant

  static final int MAX_N = 10000;

  // inner classes

  static class Diff {
    int x1, d1, x2, d2;

    Diff(int x1, int d1, int x2, int d2) {
      this.x1 = x1;
      this.d1 = d1;
      this.x2 = x2;
      this.d2 = d2;
    }
  }

  // main
  public static final void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);

    for (;;) {
      int n = sc.nextInt();
      int r = sc.nextInt();
      if ((n | r) == 0) break;

      ArrayList<ArrayList<Diff>> diffs = new ArrayList<ArrayList<Diff>>();
      for (int i = 0; i < MAX_N + 2; i++)
        diffs.add(new ArrayList<Diff>());

      int minx = MAX_N + 1, miny = MAX_N + 1;
      int maxx = 0, maxy = 0;

      for (int i = 0; i < n; i++) {
        int x1 = sc.nextInt() + 1;
        int y1 = sc.nextInt();
        int x2 = sc.nextInt() + 1;
        int y2 = sc.nextInt();

        if (minx > x1) minx = x1;
        if (miny > y1) miny = y1;
        if (maxx < x2) maxx = x2;
        if (maxy < y2) maxy = y2;

        diffs.get(y1).add(new Diff(x1,  1, x2, -1));
        diffs.get(y2).add(new Diff(x1, -1, x2,  1));
      }

      int area = 0;
      int len = 0;

      int[][] ylines = new int[2][MAX_N + 2];
      Arrays.fill(ylines[0], 0);

      int prvy = 0;
      int cury = 1;

      for (int y = miny; y <= maxy; y++) {
        Arrays.fill(ylines[cury], 0);

        for (Diff df: diffs.get(y)) {
          ylines[cury][df.x1] += df.d1;
          ylines[cury][df.x2] += df.d2;
        }

        int sumx = 0;
        for (int x = minx; x <= maxx; x++) {
          sumx += ylines[cury][x];
          ylines[cury][x] = ylines[prvy][x] + sumx;
        }

        for (int x = minx; x <= maxx; x++) {
          if (ylines[cury][x] > 0) {
            area++;
            if (ylines[cury][x - 1] == 0) len++;
            if (ylines[cury][x + 1] == 0) len++;
            if (ylines[prvy][x] == 0) len++;
          }
          else {
            if (ylines[prvy][x] > 0) len++;
          }
        }

        prvy = cury;
        cury = 1 - cury;
      }

      System.out.println(area);
      if (r == 2) System.out.println(len);
    }
  }
}