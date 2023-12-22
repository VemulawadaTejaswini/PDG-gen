import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    long a = sc.nextLong();
    long b = sc.nextLong();
    long n = sc.nextLong();

    long ret1 = 0;
    long ret2 = 0;
    long ret3 = 0;
    long max = 0;

    for (long l = n; 0 < l; l--) {
      ret1 = a * l / b;
      ret2 = l / b;
      ret3 = ret1 - (l * ret2);

      if (max < ret3) {
        max = ret3;
      } else {
        System.out.println(max);
        return;
      }
    }

  }
}
