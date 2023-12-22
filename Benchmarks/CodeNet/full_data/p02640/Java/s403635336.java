import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a, b;
    a = input.nextInt();
    b = input.nextInt();
    a = (int)Math.pow(2, a);
    System.out.println(a == b ? "Yes" : "No");
  }
}