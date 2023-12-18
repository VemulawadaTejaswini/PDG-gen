import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int prev;
    int now = 1;
    for (int i = 2; i < 1000; i++) {
      prev = now;
      now += i;
      if (b - a == now - prev) {
        System.out.println(now - b);
        return;
      }
    }
  }
}