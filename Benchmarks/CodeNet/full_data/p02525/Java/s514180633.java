import java.io.*;
import java.util.*;

class Main {
  public static void main (String[] args) throws IOException {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    String out = "";
    for (;;) {
      String line = br.readLine();
      if (line.equals("0")) {
        break;
      }
      line = br.readLine();
      String[] strs = line.split(" ");
      int[] ss = new int[strs.length];
      int sum = 0;
      for (int ii = 0; ii < ss.length; ii++) {
        ss[ii] = Integer.parseInt(strs[ii]);
        sum += ss[ii];
      }
      double avg = sum / ss.length;
      double asum = 0.0;
      for (int ii = 0; ii < ss.length; ii++) {
        asum += Math.pow(ss[ii] - avg, 2);
      }
      out += Double.toString(Math.sqrt(asum / ss.length)) + "\n";
    }
    System.out.print(out);
  }
}