import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    long x = sc.nextLong();
    long y = sc.nextLong();
    long ans = 1;

    for (long i = x; i <= ((y + 1) / 2); i *= 2) {
      ans++;
    }

    System.out.println(ans);

  }
}