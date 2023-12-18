import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) {
    new Main().run();
  }

  public void run() {

    try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {

      int pMax = 100;
      int n = Integer.parseInt(in.readLine());
      int[] x = new int[n];
      int[] y = new int[n];
      int[] h = new int[n];

      String[] lines;
      for(int i=0; i<n; i++) {
        lines = in.readLine().split(" ");
        x[i] = Integer.parseInt(lines[0]);
        y[i] = Integer.parseInt(lines[1]);
        h[i] = Integer.parseInt(lines[2]);
      }

      for(int py=0; py<=pMax; py++) {
        for(int px=0; px<=pMax; px++) {
          int needH = -1;

          for(int i=0; i<n; i++) {
            if(h[i] == 0) continue;

            int tmpH = h[i] + Math.abs(py - y[i]) + Math.abs(px - x[i]);

            if(needH == -1)
              needH = tmpH;
            else if(needH != tmpH) {
              needH = -2;
              break;
            }
          }

          if(needH == -2)
            continue;

          for(int i=0; i<n; i++) {
            if(h[i] !=0) continue;

            int dist = Math.abs(py - y[i]) + Math.abs(px -x[i]);

            if(needH > dist) {
              needH = -2;
              break;
            }
          }

          if(needH > 0) {
            System.out.println("\n" + px + " " + py + " " + needH);
            return;
          }

        }
      }
    }
    catch(IOException e) {
      System.err.println(e);
    }
  }
}