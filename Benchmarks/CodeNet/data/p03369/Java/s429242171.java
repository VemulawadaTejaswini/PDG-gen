import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String topping  = sc.next();
     topping = topping.replace("x", "");
     System.out.println(700 + 100 * topping.length());
  }
}