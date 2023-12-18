import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String n = sc.next();
    if (Integer.parseInt(n.substring(0, 3)) % 111 == 0 || Integer.parseInt(n.substring(1, 4)) % 111 == 0) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  } 
}
