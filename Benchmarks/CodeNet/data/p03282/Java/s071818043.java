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
      long k = Long.parseLong(in.readLine());

      for (int i = 0; i < k; i++) {
        if(line.charAt(i) != '1') {
          System.out.println(line.charAt(i));
          return;
        }
      }

      System.out.println("1");
    }
    catch(IOException e){
      System.err.println(e);
    }
  }
}