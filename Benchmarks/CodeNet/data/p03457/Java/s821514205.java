import java.io.*;
import java.util.Arrays;

public class Main {
  // final String testCase = "[[\"2\\n3 1 2\\n6 1 1\",\"Yes\"],[\"1\\n2 100 100\",\"No\"],[\"2\\n5 1 1\\n100 1 1\",\"No\"]]";
  public static void main(String[] args) {
    new Main().run();
  }

  public void run() {
    try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out)) {
      
      int n = Integer.parseInt(in.readLine());
      int[][] table = new int[n][3];
      
      String[] lines;
      for(int i=0; i<n; i++) {
        lines = in.readLine().split(" ");
        for(int j=0; j<3; j++)
          table[i][j] = Integer.parseInt(lines[j]);
      }

      final int t = 0;
      final int x = 1;
      final int y = 2;
      int ct,cx,cy; ct = cx = cy = 0;
      boolean isPossible = true;
      for(int i=0; i<n; i++) {
        int d = Math.abs(table[i][x] - cx) + Math.abs(table[i][y] - cy);
        int time = table[i][t] - ct;
        if(time < d || (time-d) % 2 != 0) {
          isPossible = false;
          break;
        }
      }

      String ans = isPossible ? "Yes" : "No";
      System.out.println(ans);
    }
    catch(IOException e) {
      System.err.println(e);
    }
  }
}