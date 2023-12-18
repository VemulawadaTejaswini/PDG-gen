import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String ns = sc.next();
    String[] s = ns.split("");
    System.out.println(s[0] + (s.length - 2) + s[s.length - 1]);
  }
}