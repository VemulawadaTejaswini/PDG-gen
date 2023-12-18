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
      int[] seq = new int[n];

      String line = in.readLine();
      char regex = ' ';
      boolean isContinue = true;
      for(int i=0, offset=0,next=0; isContinue; offset = ++next) {
        if((next = line.indexOf(regex,offset)) == -1) {
          next = line.length();
          isContinue = false;
        }
        seq[i++] = Integer.parseInt(line.substring(offset,next));
      }

      int p=0, sum=0;
      StringBuilder buf = new StringBuilder();
      for(int i=0; i<n; i++) {
        p = sum = 0;
        for(int j=0; j<n; j++) {
          if(j==i) continue;

          // int d = Math.abs(seq[j] - p);
          sum += Math.abs(seq[j] - p);
          p = seq[j];

          // System.out.print(d + " ");
        }
        sum += Math.abs(p);
        buf.append(sum).append('\n');
        // System.out.println();
      }

      System.out.print(buf);
    }
    catch(IOException e) {
      System.err.println(e);
    }
  }
}