import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long max = 0;
    for (int i = 1; i * i < n; i++)
      if (n % i == 0)
        max = i;
    System.out.println(max + n / max - 2);
  }
}