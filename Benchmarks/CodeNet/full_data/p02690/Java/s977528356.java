import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long x = sc.nextLong();
    long a = 0;
    long b = 0;
    for (long i = -200; i <= 200; i++) {
      for (long j = -200; j <= 200; j++) {
        if ((i * i * i * i * i) - (j * j * j * j * j) == x) {
          a = i;
          b = j;
          break;
        }
      }
    }
    System.out.println(String.format("%d %d", a, b));
  }
}