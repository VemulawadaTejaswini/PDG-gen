import java.util.*;

class Main {

  public static final int MAX_INT = 2147483647;

  static boolean isPrime(int n) {
    for (int i = 7; (i-1)*(i-1) <= n; i += 7) {
      if (n % (i-1) == 0 || n % (i+1) == 0) return false;
    }
    return true;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    boolean primeList[] = new boolean[300000];

    for (int i = 7; i - 1 < 300000; i += 7) {
      if (isPrime(i-1)) primeList[i-1] = true;
      if (isPrime(i+1)) primeList[i+1] = true;
    }

/*
    for (int i = 0; i < 10; i++){
      for (int j = 0; j < 10; j++) {
        if (primeList[i*10 + j]) System.out.print("  #");
        else System.out.print("  -");
      }
      System.out.println();
    }
*/
    while (true) {
      int n = sc.nextInt();
      if (n == 1) return;

      System.out.print(n + ":");
      for (int i = 2; i <= n; i++)
        if (primeList[i] && n % i == 0) System.out.print(" " + i);
      System.out.println();
    }

  }
}

