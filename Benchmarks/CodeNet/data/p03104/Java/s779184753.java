import java.util.Scanner;

class Main {

  public static long xor(long a, long b) {
    return a ^ b;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    long a = scanner.nextLong();
    long b = scanner.nextLong();
    if (b - a < 1) {
      System.out.println(a);
      return;
    }
    long sub = xor(a, a + 1);
    for (long i = a + 2; i <= b; i++) {
      sub = xor(sub, i);
    }
    System.out.println(sub);
  }

}
