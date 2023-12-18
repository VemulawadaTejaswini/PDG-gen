import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int a = 1800 * m + 100 * n;
    int b = a * (int)Math.pow(2, m);
    System.out.println(b);
  }
}