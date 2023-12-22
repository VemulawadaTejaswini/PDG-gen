import java.util.Scanner;

public class Main {
  static boolean[] generatePrimes() {
    boolean[] isPrime = new boolean[1000001];
    for (int i = 0; i <= 1000000; i++)
      isPrime[i] = true;

    for (int i = 2; i <= 1000000; i++)
      if (isPrime[i] == true)
        for (int j = 2*i; j <= 1000000; j += i)
          isPrime[j] = false;

    return isPrime;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean[] isPrime = generatePrimes();

    while (true) {
      int n = sc.nextInt();
      int x = sc.nextInt();
      if (n == 0 && x == 0)
        return;

      int[] dishes = new int[n];
      for (int i = 0; i < n; i++) {
        dishes[i] = sc.nextInt();
      }

      boolean[] dp = new boolean[x+1];
      dp[0] = true;

      // total payment table->
      for (int i = 0; i <= x; i++) {
        // each dish
        for (int j = 0; j < n; j++) {
          if (dp[i] == true && i+dishes[j] <= x) {
            dp[i+dishes[j]] = true;
          }
        }
      }

      int ans = 0;
      for (int i = 0; i <= x; i++) {
        if (isPrime[i] && dp[i])
          ans = i;
      }
      if (ans == 0)
        System.out.println("NA");
      else
        System.out.println(ans);
    }
  }
}