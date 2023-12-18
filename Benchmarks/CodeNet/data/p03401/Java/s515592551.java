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
      int[] seq = new int[n+2];
      seq[0] = seq[n+1] = 0;
      int[] d = new int[n+1];

      String line = in.readLine();
      char regex = ' ';
      boolean isContinue = true;
      for(int i=1, offset=0,next=0; isContinue; offset = ++next) {
        if((next = line.indexOf(regex,offset)) == -1) {
          next = line.length();
          isContinue = false;
        }
        seq[i++] = Integer.parseInt(line.substring(offset,next));
      }

      int sum=0;
      StringBuilder buf = new StringBuilder();
      for(int i=0; i<=n; i++) {
        sum += d[i] = Math.abs(seq[i+1] - seq[i]);
      }
      // sum += Math.abs(seq[n]);

      int t=0;
      for(int i=1; i<=n; i++) {
        t = 0;
        // t -= Math.abs(seq[i] - seq[i-1]);
        // t -= Math.abs(seq[i+1] - seq[i]);
        t -= d[i-1];
        t -= d[i];
        t += Math.abs(seq[i+1] - seq[i-1]);
        buf.append(sum + t).append('\n');
      }

      System.out.print(buf);
    }
    catch(IOException e) {
      System.err.println(e);
    }
  }
}