import java.awt.Point;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

import static java.lang.Integer.parseInt;

public class Main {

  final int MIN = Integer.MIN_VALUE;
  public static void main(String[] args) {
    new Main().run();
  }

  public void run() {

    try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {

      int n = parseInt(in.readLine());

      Point[] reds  = new Point[n];
      Point[] blues = new Point[n];
      String[] lines;
      for(int i=0, x=0, y=0; i<n; i++) {
        lines = in.readLine().split(" ");
        x = parseInt(lines[0]);
        y = parseInt(lines[1]);
        reds[i] = new Point(x, y); 
      }
      for(int i=0, x=0, y=0; i<n; i++) {
        lines = in.readLine().split(" ");
        x = parseInt(lines[0]);
        y = parseInt(lines[1]);
        blues[i] = new Point(x, y); 
      }

      Arrays.parallelSort(reds, new Comparator<Point>() {
        public int compare(Point a, Point b) {
          if(a.y == b.y) return 0;
          return a.y > b.y ? -1 : 1;  // 降順
        }
      });

      Arrays.parallelSort(blues, new Comparator<Point>() {
        public int compare(Point a, Point b) {
          if(a.x == b.x) return 0;
          return a.x > b.x ? 1 : -1;  // 昇順
        }
      });

      boolean[] isDone = new boolean[n];

      int ans = 0;
      // Point p = new Point(MIN,MIN);
      // int maxJ = MIN;
      for(int i=0; i<n; i++) {
        for(int j=0; j<n; j++) {
          if(!isDone[j] && reds[j].x < blues[i].x && reds[j].y < blues[i].y) {
            ans++;
            isDone[j] = true;
            break;
          }
        }
      }

      System.out.println(ans);
      // for (Point p : reds) {
      //   System.out.println(p.x + " " + p.y);
      // }
    }
    catch(IOException e) {
      System.err.println(e);
    }
  }
}