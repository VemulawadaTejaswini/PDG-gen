import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    while(true) {
      if(isPrime(n)) {
        System.out.println(n);
        break;
      } else {
        n = nextOdd(n);
      }
    }
  }

  private static int nextOdd(final int n) {
    if(n % 2 == 1) {
      return n + 2;
    } else {
      return n + 1;
    }
  }

  private static boolean isPrime(final int n) {
    if(n == 2) {
      return true;
    }
    if(n < 2 || n % 2 == 0) {
      return false;
    }
    for (int i = 3; i <= Math.sqrt(n); i = nextOdd(i)) {
      if(n % i == 0) {
        return false;
      }
    }
    return true;
   }
}
