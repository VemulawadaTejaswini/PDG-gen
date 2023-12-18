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
      int n = Integer.parseInt(lines[0]);
      int k = Integer.parseInt(lines[1]);
      int ans = 1;
      int d = k - 1;

      for(int i=n; i>k; i-=d)
        ans++;
      System.out.println(ans);
    }
    catch(IOException e) {
      System.err.println(e);
    }
  }
}