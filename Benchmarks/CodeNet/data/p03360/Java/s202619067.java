import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int k = sc.nextInt();
    int sum = a + b + c;
    int d = Math.max(a, Math.max(b, c));
    sum -= d;
    d = (int)Math.pow(2, k) * d;
    sum += d;
    System.out.println(sum);
  }
}
