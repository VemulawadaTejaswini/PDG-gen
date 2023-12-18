import java.awt.geom.*;
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Main {
  private static PrintWriter pw;

  public static int longestConsecutive(ArrayList<Integer> array) {
    int longest = 0;
    // For each possible start
    for (int i = 0; i < array.size(); i++) {
      // Count consecutive.
      for (int j = i + 1; j < array.size(); j++) {
        // This one consecutive to last?
        if (Math.abs(array.get(j) - array.get(j - 1)) == 1) {
          // Is it longer?
          if (j - i > longest) {
            // Yup! Remember it.
            longest = j - i;
          }

        } else {
          // Start again.
          break;
        }
      }
    }
    return longest + 1;
  }

  public static void main(String[] args) {
    pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    HashMap<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();

    ArrayList<Integer> aList = new ArrayList<Integer>();

    Scanner sc = new Scanner(System.in);
    // 整数の入力
    int n = sc.nextInt();
    int count = 1;

    ArrayList<Integer> table = new ArrayList<Integer>();

    for (int i = 0; i < n; i++) {
      aList.add(sc.nextInt());
    }

    count = longestConsecutive(aList);

    pw.println(n - count);
    exitImmediately();
  }

  private static void exitImmediately() {
    pw.close();
    System.exit(0);
  }
}