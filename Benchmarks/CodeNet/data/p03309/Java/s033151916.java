import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) {

    new Main().run();
  }
  public void run() {
    
    try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {

      int n = Integer.parseInt(in.readLine());
      String line = in.readLine();
      int[] ax = new int[n];
      int sum = 0;

      int m;
      int offset=0,next=0;
      char regex = ' ';
      boolean isContinue = true;
      for(int i=0; isContinue; i++) {
        if((next = line.indexOf(regex,offset)) == -1) {
          next = line.length();
          isContinue = false;
        }
        m = Integer.parseInt(line.substring(offset,next));
        ax[i] = m - (i+1);
        offset = ++next;
      }

      Arrays.sort(ax);
      int b = ax[(n>>1)+1];

      for (int i : ax) {
        sum += Math.abs(i-b);
      }

      System.out.println(sum);

    }
    catch(IOException e) {
      System.err.println(e);
    }
  }
}