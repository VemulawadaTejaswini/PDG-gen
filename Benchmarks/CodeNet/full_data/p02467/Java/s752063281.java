import java.util.Scanner;

class PrimeFactorize {

  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    int n = stdIn.nextInt();

    System.out.print(n + ":");
    for (int i = 2; i < Math.sqrt(n); i++) {
      if (n % i == 0) {
        System.out.print(" " + i);
        n /= i;
        i--;
      }
    }
  }
}