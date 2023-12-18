import java.io.*;

public class Main {
  public static void main(String[] args) {
    new Main().run();
  }

  private void run() {
    try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out)) {

        String[] lines = in.readLine().split(" ");
        long r =Long.parseLong(lines[0]);
        long d =Long.parseLong(lines[1]);
        long x =Long.parseLong(lines[2]);

        long ans = 0;
        for (int i = 0; i < 10; i++) {
          ans = r * x - d;
          out.println(ans);
          x = ans;
        }

        out.flush();
    }
    catch(IOException e) {
      System.err.println(e);
    }
  }
}