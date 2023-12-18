import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

  public static void main(String[] args) {
    new Main().run();
  }

  public void run() {

    try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out)) {

      String[] lines = in.readLine().split(" ");
      int x = Integer.parseInt(lines[0]);
      int y = Integer.parseInt(lines[1]);

      int ans = x + (y>>1);
      System.out.println(ans);
    }
    catch(IOException e) {
      System.err.println(e);
    }
  }
}