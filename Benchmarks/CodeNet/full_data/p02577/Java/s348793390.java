import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String ns = sc.next();
    String[] s = ns.split("");
    int sum = 0;
    for (int i = 0; i < s.length; i++) {
      sum = sum + Integer.parseInt(s[i]);
    }
    if (sum % 9 == 0) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}