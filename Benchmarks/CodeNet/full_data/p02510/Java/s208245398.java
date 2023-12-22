import java.io.*;
import java.util.*;

class Main {
  public static void main (String[] args) throws IOException {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    String str = "";
    String out = "";
    int cnt = 0;
    for (;;) {
      String line = br.readLine();
      if (line.equals("-")) {
        break;
      }
      if (str.equals("")) {
        str = line;
        continue;
      }
      if (cnt == 0) {
        cnt = Integer.parseInt(line);
        continue;
      }
      int n = Integer.parseInt(line);
      String p = str.substring(0, n);
      String s = str.substring(n);
      str = s + p;
      cnt--;
      if (cnt == 0) {
        out += str + "\n";
        str = "";
        cnt = 0;
        continue;
      }
    }
    System.out.print(out);
  }
}