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

      if(line.equals("1"))
        System.out.println("Hello World");
      else {
        int a = Character.getNumericValue(in.readLine().charAt(0));
        int b = Character.getNumericValue(in.readLine().charAt(0));
        System.out.println(a+b);
      }
    }
    catch(IOException e) {
      System.err.println(e);
    }
  }
}