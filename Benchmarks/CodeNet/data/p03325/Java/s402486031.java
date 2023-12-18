import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) {
    new Main().run();
  }

  public void run() {
    
    try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {

      int n = Integer.parseInt(in.readLine());
      String line = in.readLine();
      int ans = 0;

      char regex = ' ';
      boolean isContinue = true;
      for(int ai=0, offset=0, next=0 ; isContinue; offset = ++next) {
        if((next = line.indexOf(regex, offset)) == -1) {
          next = line.length();
          isContinue = false;
        }

        ai = Integer.parseInt(line.substring(offset, next));
        ans += Integer.numberOfTrailingZeros(ai);
      }

      System.out.println(ans);
    }
    catch(IOException e) {
      System.err.println(e);
    }
  }
}