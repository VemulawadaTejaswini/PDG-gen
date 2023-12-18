import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    long M = scanner.nextInt();
    Set<Integer> list = new HashSet<>();
    for (int i = 0; i < N; i++) list.add(scanner.nextInt() / 2);
    List<Integer> a = new ArrayList<>(list);

    Set<Integer> set = new HashSet<>();
    for (int num : a) set.add(countTwoPower(num));
    if (set.size() > 1) {
      System.out.println(0);
      return;
    }

    int gcd = a.get(0);
    for (int num : a) gcd = gcd(gcd, num);

    long lcm = gcd;
    for (int num : a) lcm = lcm * (num / gcd);

    if (M < lcm) {
      System.out.println(0);
      return;
    }
    System.out.println((M - lcm) / (lcm * 2) + 1);
  }

  private static int countTwoPower(int a) {
    int cnt = 0;
    while (a % 2 == 0) {
      a /= 2;
      cnt++;
    }
    return cnt;
  }

  private static int gcd(int i, int j) {
    if (i > j) return gcd(j, i);
    while (i > 0) {
      int r = j % i;
      j = i;
      i = r;
    }
    return j;
  }
}
