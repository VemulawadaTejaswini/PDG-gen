import java.awt.geom.*;
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Main {
  private static PrintWriter pw;

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
      table.add(1);
    }

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (table.get(j) + aList.get(j) == aList.get(i)) {
          count = Math.max(table.get(j) + 1, count);
          table.set(j, table.get(j) + 1);
          break;
        }
      }
    }

    pw.println(n - count);
    exitImmediately();
  }

  private static void exitImmediately() {
    pw.close();
    System.exit(0);
  }
}