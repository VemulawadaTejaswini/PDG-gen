import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println(((b - a + 1) >= k) ? "OK" : "NG");
  }
}
