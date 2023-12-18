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

    long num = (long) Math.pow(10, 18);

    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();
    long c = sc.nextLong();
    long k = sc.nextLong();

    if (num < Math.abs(a - b)) {
      pw.println("Unfair");
      exitImmediately();
    }

    if (k % 2 == 0) {
      pw.println(a - b);
    } else {
      pw.println(b - a);
    }

    exitImmediately();
  }

  private static void exitImmediately() {
    pw.close();
    System.exit(0);
  }
}