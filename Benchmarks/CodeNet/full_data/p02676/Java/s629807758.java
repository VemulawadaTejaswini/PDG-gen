import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      String s = sc.next();
      int k = Integer.parseInt(sc.next());
      if (s.length() <= k) {
        System.out.println(s);
      } else {
        System.out.println(s.substring(k) + "...");
      }
    }
  }
}