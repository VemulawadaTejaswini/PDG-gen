import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    char a2 = a.charAt(0);
    if (Character.isUpperCase(a2)) {
      System.out.println("A");
    } else {
      System.out.println("a");
    }
  }
}
