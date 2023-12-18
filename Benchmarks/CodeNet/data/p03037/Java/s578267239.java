import java.io.*;

public class Main {
  public static void main(String[] args) {
    new Main().run();
  }

  private void run() {
    try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out)) {

        String[] lines = in.readLine().split(" ");
        final int n = Integer.parseInt(lines[0]);
        final int m = Integer.parseInt(lines[1]);

        int lc, rc;
        int[] table = new int[n+2];
        for (int i = 0; i < m; i++) {
          lines = in.readLine().split(" ");
          lc = Integer.parseInt(lines[0]);
          rc = Integer.parseInt(lines[1]);
          table[lc]   += 1;
          table[rc+1] -= 1;
        }

        for (int i = 0; i < n; i++) {
          table[i+1] += table[i];
        }

        int cnt = 0;
        for (int i : table) {
          if(i == m) cnt++;
        }

        final int ans = cnt;
        out.println(ans);
        out.flush();
    }
    catch(IOException e) {
      System.err.println(e);
    }
  }
}