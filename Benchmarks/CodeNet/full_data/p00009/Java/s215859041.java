import java.util.Scanner;

public class Main {
  private static final int MAX = 1000000;
  private Scanner sc = new Scanner(System.in);

  private void run() {
    boolean[] primes = primes();

    while(sc.hasNextInt()) {
      int n = sc.nextInt();

      int x = 0;
      for(int i = 0; i <= n; i++) {
        if(primes[i]) x++;
      }

      System.out.println(x);
    }
  }

  private boolean[] primes() {
    boolean[] ns = new boolean[MAX];
    for(int i = 2; i < MAX; i++) ns[i] = true;

    for(int i = 2; i < MAX; i++) {
      if(ns[i] == false) continue;

      if(i * i > MAX) break;

      for(int j = i * i; j < MAX; j += i) {
        ns[j] = false;
      }
    }

    return ns;
  }

  public static void main(String[] args) {
    new Main().run();
  }
}