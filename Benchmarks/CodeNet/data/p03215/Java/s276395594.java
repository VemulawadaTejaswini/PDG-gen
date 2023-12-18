import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    new Main().run();
  }

  public void run() {
    
    try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out)) {
          String[] s = in.readLine().split(" ");
          int n = Integer.parseInt(s[0]);
          int k = Integer.parseInt(s[1]);

          String line = in.readLine();
          int[] a = new int[n];
          char regex = ' ';
          boolean isContinue = true;
          for(int i=0, offset=0,next=0; isContinue; i++, offset = ++next) {
            if((next = line.indexOf(regex,offset)) == -1) {
              next = line.length();
              isContinue = false;
            }
            a[i] = Integer.parseInt(line.substring(offset,next));
          }

          List<Long> list = new ArrayList<>();
          for(int i=0; i<n; i++) {
            long sum = 0;
            for(int j=i; j<n; j++) {
              sum += a[j];
              list.add(sum);
            }
          }
          list.sort(Comparator.reverseOrder());
          long rm = list.get(0);
          for(int i=1; i<k; i++) {
            rm = list.get(i) & rm;
          }

          System.out.println(rm);
      }
      catch(IOException e) {
        System.err.println(e);
      }
  }
}