import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) {
    new Main().run();
  }

  public void run() {

    try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {

      String[] lines = in.readLine().split(" ");
      int n = Integer.parseInt(lines[0]);
      int t = Integer.parseInt(lines[1]);
      // int[] cost = new int[n];
      // int[] time = new int[n];
      int cost;
      int time;
      int ans = Integer.MAX_VALUE;

      for(int i=0; i<n; i++) {
        lines = in.readLine().split(" ");
        cost = Integer.parseInt(lines[0]);
        time = Integer.parseInt(lines[1]);
        if(time <= t)
          ans = Math.min(ans,cost);
      }

      System.out.println(ans < 100000 ? ans : "TLE");
    }
    catch(IOException e) {
      System.err.println(e);
    }
  }
}