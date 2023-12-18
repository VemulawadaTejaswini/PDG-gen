import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int k = sc.nextInt();
    long sum = 0;
    for (int i = 1; i <= k; i++) {
      for (int j = 1; j <= k; j++) {
        for (int l = 1; l <= k; l++) {
          sum += gcd(i, j, l);
        }
      }
    }
    System.out.println(sum);
  }

  private static int gcd(int a, int b, int c) {
    List<Integer> args = new ArrayList<>();
    args.add(a);
    args.add(b);
    args.add(c);
    int ans = 0;
    for (Integer arg : args) {
      ans = gcd(ans, arg);
    }
    return ans;
  }

  private static int gcd (int a, int b) {
    int temp;
    while((temp = a % b) != 0) {
      a = b;
      b = temp;
    }
    return b;
  }
}
