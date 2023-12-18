import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner std = new Scanner(System.in);
    String s = std.next();
    char c = s.charAt(0);
    c++;
    String ans = String.valueOf(c);
    System.out.println(ans);
  }
}
