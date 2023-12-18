import java.util.*;
public class Main {
  public static void main(String...args) {
    final Scanner sc = new Scanner(System.in);
    final int a = sc.nextInt();
    final int b = sc.nextInt();
    System.out.println(a + b == 15 ? '+' : a * b = 15 ? '*' : 'x');
  }
}