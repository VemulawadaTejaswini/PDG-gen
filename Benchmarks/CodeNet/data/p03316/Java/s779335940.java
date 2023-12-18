import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int ans =0;
    int N = a;
    while (N > 0) {
      ans += N % 10;
      N /= 10;
    }
    if (a % ans == 0) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}