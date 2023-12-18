import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    long tm = 1, am = 1;
    for (int i = 0; i < N; i++) {
      long t = scanner.nextInt();
      long a = scanner.nextInt();
      long k = Math.max((tm - 1) / t, (am - 1) / a);
      tm = (k + 1) * t;
      am = (k + 1) * a;
    }
    System.out.println(tm + am);
  }
}
