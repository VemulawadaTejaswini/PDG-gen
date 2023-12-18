import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) {
    
    new Main().run();
  }

  public void run(){

    try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {

      String[] lines = in.readLine().split(" ");
      int n = Integer.parseInt(lines[0]);
      int k = Integer.parseInt(lines[1]);

      long ans;
      if((k & 1) == 0) {
        long a = n / k;
        long b = n / (k / 2);
        long c = b - a;
        ans = (a * a * a) + (c * c * c);
      } else {
        long a = n / k;
        ans = a * a * a;
      }

      System.out.println(ans);
    }
    catch(IOException e) {
      System.err.println(e);
    }
  }
}