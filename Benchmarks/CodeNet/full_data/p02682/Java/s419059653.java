import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int k = sc.nextInt();
    sc.close();

    int ans = 0;

    ans = Math.min(k, a);
    k -= a;

    if (k >= b) {
      k -= b;
    }


    ans -= Math.min(k, c);

    System.out.println(ans);
  }
}