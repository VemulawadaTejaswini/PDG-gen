import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int k = sc.nextInt();
    int res;
    if (a + b >= k) {
      if (a >= k) {
        res = k;
      } else {
        res = a;
      }
    } else {
      res = 2*a+b-k;
    }
    System.out.println(res);
    sc.close();
  }
}