package abc;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int out = 7;
    if (s.equals("MON")) {
      out = 6;
    }
    if (s.equals("TUE")) {
      out = 5;
    }
    if (s.equals("WED")) {
      out = 4;
    }
    if (s.equals("THU")) {
      out = 3;
    }
    if (s.equals("FRI")) {
      out = 2;
    }
    if (s.equals("SAT")) {
      out = 1;
    }
    System.out.println(out);
  }
}
