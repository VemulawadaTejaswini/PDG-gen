import java.io.*;
import java.util.*;

class Main {
  public static void main (String[] args) throws IOException {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    String line = br.readLine();
    int turn = Integer.parseInt(line);
    int ap = 0;
    int bp = 0;
    for (int ii = 0; ii < turn; ii++) {
      line = br.readLine();
      String[] strs = line.split(" ");
      String[] work = line.split(" ");
      if (strs[0].equals(strs[1])) {
        ap++;
        bp++;
        continue;
      }
      java.util.Arrays.sort(work);
      if (work[0].equals(strs[0])) {
        bp += 3;
      } else {
        ap += 3;
      }
    }
    System.out.printf("%d %d\n", ap, bp);
  }
}