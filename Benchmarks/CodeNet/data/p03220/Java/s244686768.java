import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

  public static void main(String[] args) {
    new Main().run();
  }

  public void run() {

    try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out)) {

      int n = Integer.parseInt(in.readLine());
      String[] lns = in.readLine().split(" ");
      int t = Integer.parseInt(lns[0]);
      int a = Integer.parseInt(lns[1]);
      int[] h = new int[n];

      String line = in.readLine();
      char regex = ' ';
      boolean isContinue = true;
      for(int i=0, offset=0,next=0; isContinue; offset = ++next) {
        if((next = line.indexOf(regex,offset)) == -1) {
          next = line.length();
          isContinue = false;
        }
        h[i++] = Integer.parseInt(line.substring(offset,next));
      }

      int ans=0;
      double tmp = 0;
      double min = Integer.MAX_VALUE;
      for(int i=0; i<n; i++) {
        tmp = Math.abs( a - (t - h[i]) * 0.0006 );
        if(tmp < min ) {
          ans = i+1;
          min = tmp;
        }
      }
      System.out.println(ans);
    }
    catch(IOException e) {
      System.err.println(e);
    }
  }
}