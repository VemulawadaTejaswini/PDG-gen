import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String s = scan.next();
    String t = scan.next();

    int sLen = s.length();
    int tLen = t.length();
    int min = 1001;

    for (int i = 0; i <= sLen - tLen; i++) {
      int diff;
      try {
        // System.out.println(s.substring(j-i, j+tLen-i) + " vs " + t);
        diff = calculateDiff(s.substring(i, i+tLen), t);
        // System.out.println("diff : " + diff);
      } catch (StringIndexOutOfBoundsException e) {
        continue;
      }
      if (min > diff) {
        min = diff;
      }
    }
    if (min == 1001) {
      min = tLen;
    }

    PrintWriter out = new PrintWriter(System.out);
    out.println(min);
    out.flush();
  }

  public static int calculateDiff(String a, String b) {
    int count = 0;
    for (int i = 0; i < b.length(); i++) {
      if (!a.substring(i, i+1).equals(b.substring(i, i+1))) {
        count++;
      }
    }
    return count;
  }
}
