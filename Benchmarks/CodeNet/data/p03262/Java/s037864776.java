import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Stream;;

public class Main {

  public static void main(String[] args) {
    new Main().run();
  }

  public void run() {
    
    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      String[] lines = br.readLine().split(" ");
      int  n = Integer.parseInt(lines[0]);
      long z = Long.parseLong(lines[1]);

      String seq = z + " " + br.readLine();
      n++;

      final Pattern delim = Pattern.compile(" ");
      long[] ax = delim
        .splitAsStream(seq)
        .mapToLong(Long::parseLong)
        .sorted()
        .toArray();
      
      long min = Long.MAX_VALUE;
      // long absL;
      long[] de = new long[n-1];
      long prev = 0;
      for(int i=0; i<n-1; i++) {
        de[i] = Math.abs(ax[i+1] - ax[i]);
        if(de[i] < min)
          min = de[i];
        else if(de[i] == min) {
          if(prev == min)
            min *= 2;
        }
        prev = de[i];
      }

      System.out.println(min);
    }
    catch(IOException e) {
      System.err.println(e);
    }
  }
}