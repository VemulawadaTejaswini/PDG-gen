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
      int a = Integer.parseInt(lines[0]);
      int b = Integer.parseInt(lines[1]);
      int k = Integer.parseInt(lines[2]);

      for(int i=0; i<k; i++) {
        if((i & 1) == 0) {
          if((a & 1) == 1) a--;
          b += (a /= 2);
        }
        else {
          if((b & 1) == 1) b--;
          a += (b /= 2);
        }
      }

      System.out.println(a + " " + b);
    }
    catch(IOException e) {
      System.err.println(e);
    }
  }
}