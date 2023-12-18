import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String ns = sc.next();
    String[] s = ns.split("");
    int sum = 700;
    for (int i = 0; i < s.length; i++) {
      if (s[i].equals("o")) {
        sum += 100;
      }
    }
    System.out.println(sum);
  }
}