import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int T = Integer.parseInt(sc.next());
    for (int i = 0; i < T; i++) {
      long a = Long.parseLong(sc.next());
      long b = Long.parseLong(sc.next());
      long c = Long.parseLong(sc.next());
      long d = Long.parseLong(sc.next());

      if (a < b || d < b) {
        System.out.println("No");
        continue;
      } else if (c >= b - 1) {
        System.out.println("Yes");
        continue;
      }

      long aMod = a % b;
      long dMod = d % b;

      if (aMod <= c && dMod == 0) {
        System.out.println("Yes");
        continue;
      }

      if (aMod > c || b - 1 - c >= dMod || gcd(b, dMod) == 1) {
        System.out.println("No");
        continue;
      }

      long sum = aMod;
      while (true) {
        sum = (sum + dMod) % b;
        if (sum > c) {
          System.out.println("No");
          break;
        }
        if (sum == aMod) {
          System.out.println("Yes");
          break;
        }
      }

    }
  }

  public static long gcd(long a, long b) {
    return (b == 0) ? a : gcd(b, a % b);
  }
}