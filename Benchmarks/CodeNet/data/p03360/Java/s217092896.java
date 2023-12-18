import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int k = sc.nextInt();
    int max_ab = Integer.max(a, b);
    int max_bc = Integer.max(b, c);
    int max = Integer.max(max_ab, max_bc);
    int result = max;
    for (int i = 0; i < k; i++) {
      result *= 2;
    }
    result = result + a + b + c - max;
    System.out.println(result);
  }
}