import java.io.*;
import java.util.*;

class Main {
  public static void main (String[] args) throws IOException {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    String line = br.readLine();
    line = br.readLine();
    String[] s = line.split(" ");
    line = br.readLine();
    line = br.readLine();
    String[] t = line.split(" ");
    int c = 0;
    for (int ii = 0; ii < s.length; ii++) {
      for (int jj = 0; jj < t.length; jj++) {
        if (s[ii].equals(t[jj])) {
          cc++;
          break;
        }
      }
    }
    System.out.println(c);
  }
}