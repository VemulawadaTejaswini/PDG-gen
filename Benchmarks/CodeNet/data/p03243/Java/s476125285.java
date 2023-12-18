import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String n = sc.next();
    int n1 = n.charAt(0) - '0';
    int n2 = n.charAt(1) - '0';
    int n3 = n.charAt(2) - '0';
    int max12 = Integer.max(n1, n2);
    int max23 = Integer.max(n2, n3);
    int max = Integer.max(max12, max23);
    System.out.println("" + max + max + max);
  }
}