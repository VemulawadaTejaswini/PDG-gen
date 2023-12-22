import java.io.*;
import java.util.*;

class Main {
  // constant

  static final int MAX_INT = (1 << 31) - 1;

  // inner classes

  static class Point {
    int x, y, d;

    Point(int x, int y) {
      this.x = x;
      this.y = y;
      this.d = MAX_INT;
    }
  }

  // subroutines

  static int dist(Point p0, Point p1) {
    return Math.abs(p1.x - p0.x) + Math.abs(p1.y - p0.y);
  }

  // main

  public static final void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    Point[][] nodes = new Point[7][1000];
    int[] nlens = new int[7];

    while (true) {
      String[] wh = br.readLine().trim().split(" ");
      int w = Integer.parseInt(wh[0]);
      int h = Integer.parseInt(wh[1]);
      if (w == 0 && h == 0) break;

      for (int attr = 0; attr < 7; attr++) nlens[attr] = 0;

      Point start = null;
      Point goal = null;

      for (int y = 0; y < h; y++) {
        String hl = br.readLine().trim();

        for (int x = 0; x < w; x++) {
          char ch = hl.charAt(x);

          switch (ch) {
          case 'S':
            nodes[5][0] = start = new Point(x, y);
            nlens[5] = 1;
            break;
          case 'G':
            nodes[6][0] = goal = new Point(x, y);
            nlens[6] = 1;
            break;
          case '.':
            break;
          default:
            int attr = ch - '1';
            nodes[attr][nlens[attr]++] = new Point(x, y);
          }
        }
      }

      boolean invalid = false;

      for (int attr = 0; attr < 7; attr++)
        if (nlens[attr] == 0) {
          invalid = true;
          break;
        }

      if (invalid) {
        System.out.println("NA");
        continue;
      }

      int min_dist = MAX_INT;
      int min_attr = -1;

      for (int sattr = 0; sattr < 5; sattr++) {
        nodes[5][0].d = 0;

        int[] attrs = new int[6];
        for (int k = 1; k <= 4; k++) attrs[k] = (sattr + k) % 5;
        attrs[0] = 5;
        attrs[5] = 6;

        for (int k = 1; k < 6; k++) {
          int prev_attr = attrs[k - 1];
          int attr0 = attrs[k];

          for (int i = 0; i < nlens[attr0]; i++) {
            Point nd = nodes[attr0][i];
            int min_dist0 = MAX_INT;

            for (int j = 0; j < nlens[prev_attr]; j++) {
              Point p_nd = nodes[prev_attr][j];
              int d = p_nd.d + dist(p_nd, nd);
              if (min_dist0 > d) min_dist0 = d;
            }

            nd.d = min_dist0;
          }
        }

        //System.out.println("" + (sattr + 1) + " " + nodes[6][0].d);

        if (min_dist > nodes[6][0].d) {
          min_dist = nodes[6][0].d;
          min_attr = sattr + 1;
        }
      }

      if (min_attr < 0)
        System.out.println("NA");
      else
        System.out.println("" + min_attr + " " + min_dist);
    }
  }
}