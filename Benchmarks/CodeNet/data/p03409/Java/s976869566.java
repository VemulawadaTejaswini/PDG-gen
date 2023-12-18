import java.awt.Point;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import static java.lang.Integer.parseInt;

public class Main {

  final int MIN = -1_000_000_000;
  public static void main(String[] args) {
    new Main().run();
  }

  public void run() {

    try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {

      int n = parseInt(in.readLine());

      pxPoint[] reds  = new pxPoint[n];
      pxPoint[] blues = new pxPoint[n];
      String[] lines;
      for(int i=0, x=0, y=0; i<n; i++) {
        lines = in.readLine().split(" ");
        x = parseInt(lines[0]);
        y = parseInt(lines[1]);
        reds[i] = new pxPoint(x, y); 
      }
      for(int i=0, x=0, y=0; i<n; i++) {
        lines = in.readLine().split(" ");
        x = parseInt(lines[0]);
        y = parseInt(lines[1]);
        blues[i] = new pxPoint(x, y); 
      }

      Arrays.parallelSort(reds);
      Arrays.parallelSort(blues);

      boolean[] isDone = new boolean[n];

      int ans = 0;
      pxPoint p = new pxPoint(MIN,MIN);
      int maxJ = MIN;
      for(int i=0; i<n; i++) {
        for(int j=0; j<n; j++) {
          if(!isDone[j] && reds[j].x < blues[i].x) {
            if(reds[j].y > p.y) {
              p.x = reds[j].x;
              p.y = reds[j].y;
              maxJ = j;
            }
          }
        }
        if(maxJ != MIN) {
          ans++;
          isDone[maxJ] = true;
          p.x = MIN; p.y = MIN; maxJ = MIN;
        }
      }

      System.out.println(ans);
      // for (pxPoint p : reds) {
      //   System.out.println(p.x + " " + p.y);
      // }
    }
    catch(IOException e) {
      System.err.println(e);
    }
  }

  class pxPoint extends Point implements Comparable<pxPoint> {

    public pxPoint() {
      super();
    }
    public pxPoint(int x, int y) {
      super(x, y);
    }

    // @Override
    public int compareTo(pxPoint obj) {
      if(this.x == obj.x) return 0;
      return this.x > obj.x ? 1 : -1;
    }
  }
}