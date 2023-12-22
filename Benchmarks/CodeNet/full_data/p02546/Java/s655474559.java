import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String ns = sc.next();
    String[] s = ns.split("");
    if (s[s.length - 1].equals("s")) {
      System.out.println(ns + "es");
    } else {
      System.out.println(ns + "s");
    }
  }
}