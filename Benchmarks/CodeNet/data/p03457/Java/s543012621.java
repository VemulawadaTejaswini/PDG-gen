import java.io.*;

public class Main {
  public static void main(String[] args) {
    new Main().run();
  }

  public void run() {
    try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out)) {

      int n = Integer.parseInt(in.readLine());
      int[] table = new int[3];

      String[] lines;
      final int t = 0;
      final int x = 1;
      final int y = 2;
      boolean isPossible = true;

      for(int i=0; i<n; i++) {
        lines = in.readLine().split(" ");
        for(int j=0; j<3; j++)
          table[j] = Integer.parseInt(lines[j]);

          int d = table[x] + table[y];
          int time = table[t];
          if(time < d || (time - d) % 2 != 0) {
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