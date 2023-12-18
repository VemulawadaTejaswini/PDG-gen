import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) {
    new Main().run();
  }

  public void run() {

    try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {

      String line = in.readLine();

      if(line.length()  == 2)
        System.out.println(line);
      else {
        StringBuilder sb = new StringBuilder();
        sb.append(line).reverse();
        System.out.println(sb);
      }
    }
    catch(IOException e) {
      System.err.println(e);
    }
  }
}