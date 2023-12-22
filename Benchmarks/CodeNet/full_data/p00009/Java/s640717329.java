import java.util.Scanner;
import java.lang.Integer;

public class Main {
  private static boolean[] eratos;

  private static int printPrime(int n) {
    eratos = new boolean[n+1];
    eratos[0] = false;
    eratos[1] = false;

    if (n <= 1) return 0;

    for (int i = 2; i <= n; i++) {
      eratos[i] = true;
    }

    for (int i = 2; i <= n; i++) {
      int j = i;
      while (i * j <= n) {
        eratos[i * j] = false;
        j++;
      }
    }

    int cnt = 0;
    for (int i = 2; i <= n; i++) {
      if (eratos[i]) {
        cnt++;
        //System.out.println(i);
      }
    }

    return cnt;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while(true) {
      int N = sc.nextInt();
      System.out.println(printPrime(N));
    }
  }
}