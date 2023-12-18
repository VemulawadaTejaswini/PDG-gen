import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int n = S.length();
    System.out.println("" + S.charAt(0) + (n-2) + S.charAt(n-1));
  }
}