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
      int offset=0,next=0;
      char regx = ' ';
      long[] ax = new long[n];
      for(int i=0; i<n; i++) {
        if((next = line.indexOf(regx,offset)) == -1)
          next = line.length();
        ax[i] = Integer.parseInt(line.substring(offset, next));
        offset = next + 1;
      }

      long min = Long.MAX_VALUE;
      for(int i=0; i<n-k+1; i++) {
        long pos = 0, cost = 0;
        for(int j=i; j<k+1; j++) {
          cost += Math.abs(pos - ax[j]);
          if(cost > min) break;
          pos = ax[j];
        }

        if(min > cost) min = cost;
      }

      if(min == Long.MAX_VALUE) min = 0;

      System.out.println(min);
    }
    catch(IOException e) {
      System.out.println(e);
    }
  }
}