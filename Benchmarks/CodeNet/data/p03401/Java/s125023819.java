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
      int[] seq = new int[n+1];
      seq[0] = 0;

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

      int p=0, sum=0;
      StringBuilder buf = new StringBuilder();
      for(int i=0; i<n; i++) {
        sum += Math.abs(seq[i+1] - seq[i]);
      }
      p = sum;
      sum += Math.abs(seq[n]);
      // buf.append(sum);

      for(int i=1; i<n; i++) {
        if(seq[i-1] < seq[i] && seq[i] < seq[i+1]) {
          buf.append(sum).append('\n');
        }
        else if(seq[i-1] > seq[i] && seq[i] > seq[i+1]) {
          buf.append(sum).append('\n');
        }
        else {
          buf.append(sum - (Math.abs(seq[i]-seq[i-1])<<1)).append('\n');
        }
      }
      if(seq[n] <= 0 && seq[n-1] >= 0)
        sum -= Math.abs(seq[n])<<1;
      else
        sum -= Math.abs(seq[n]-seq[n-1])<<1;
      buf.append(sum).append('\n');

      System.out.print(buf);
    }
    catch(IOException e) {
      System.err.println(e);
    }
  }
}