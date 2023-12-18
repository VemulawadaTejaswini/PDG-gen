import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();
    long c = sc.nextInt();
    long d = sc.nextInt();

    long count = b - a + 1;

    for (long i = c; i <= b; i += c) {
      if (i % d != 0 && i >= a)
        --count;
    }

    for (long i = d; i <= b; i += d) {
      if (i >= a)
        --count;
    }

    System.out.println(count);
  }
}