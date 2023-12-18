import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int k = scan.nextInt();
    String s = scan.next();
    System.out.println(s.subString(0, k - 1) + s.subString(k - 1, k - 1).toLowerCase() + s.subString(k));
  }
}