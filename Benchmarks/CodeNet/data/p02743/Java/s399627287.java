import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long a = sc.nextInt();
    long b = sc.nextInt();
    long c = sc.nextInt();
    long left = 2 * (a * b + b * c + c * a);
    long right = a * a + b * b + c * c;
    System.out.println(left < right ? "Yes" : "No");
  }
}
