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
      int x1 = Integer.parseInt(lines[0]);
      int y1 = Integer.parseInt(lines[1]);
      int x2 = Integer.parseInt(lines[2]);
      int y2 = Integer.parseInt(lines[3]);

      int dx = x2 - x1;
      int dy = y2 - y1;

      int x3 = x2 - dy;
      int y3 = y2 + dx;

      int x4 = x3 - dx;
      int y4 = y3 - dy;

      System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
    }
    catch(IOException e) {
      System.err.println(e);
    }
  }
}