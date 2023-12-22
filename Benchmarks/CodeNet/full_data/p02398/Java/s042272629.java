import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int a = s.nextInt();
    int b = s.nextInt();
    int c = s.nextInt();
    int divisors = 0;
    for (int i = a; i <= b; i++) {
      if (c % i == 0)
        divisors++;
    }
    System.out.println(divisors);
  }
}

