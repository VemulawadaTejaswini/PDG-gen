import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long a = sc.nextLong();
    long b = sc.nextLong();
    long ans = 0;
    if (a > b) {
      ans = 0;
    } else if (n == 1 && a != b) {
      ans = 0;
    } else if (n == 1){
      ans = 1;
    } else {
      ans += (n-2) * (b - a) + 1;
    }

    System.out.println(ans);
  }
}
