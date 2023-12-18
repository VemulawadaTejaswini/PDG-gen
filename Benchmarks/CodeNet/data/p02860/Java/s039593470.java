package atcoder.abc.b;

import java.util.Scanner;

public class Main {
  public static void main(final String[] args) {
    final String str = new Scanner(System.in).next();
    if (str.length() % 2 == 1) {
      System.out.println("No");
      return;
    }

    final String halfStr = str.substring(0, str.length() / 2);
    final String answer = str.equals(halfStr + halfStr) ? "Yes" : "No";
    System.out.println(answer);
  }
}