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
      String line = in.readLine();

      int offset=0,next=0,index=0,m;
      char regex = ' ';
      boolean isContinue = true;
      for(int i=0; isContinue; i++) {
        if((next = line.indexOf(regex,offset)) == -1) {
          next = line.length();
          isContinue = false;
        }
        m = Integer.parseInt(line.substring(offset,next));
        if(m == 1) {
          index = i;
          isContinue = false;
        }
        offset = ++next;
      }

      // System.out.println(index);

      int f = index + 1;
      int fc = 0;
      if((f -= k) > 0) {
        fc++;
        if(f <= 0)
          fc += (f +(k-1-1)) / (k-1);
      }
      else
        fc++;

      int bc = 0;
      int b = n - index;
      if((b -= k) > 0) {
        bc++;
        if(f <= 0)
          bc += (b +(k-1-1)) / (k-1);
      }
      else
        bc++;

      int ans = (index+1) < k ? fc : fc + bc;

      // System.out.println(ans + "(" + fc + "+" + bc + ")");
      System.out.println(ans);
    }
    catch(IOException e) {
      System.err.println(e);
    }
  }
}