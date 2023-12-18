import java.io.InputStream;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    Set<Integer> aPrimes = primes(Long.parseLong(sc.next()));
    Set<Integer> bPrimes = primes(Long.parseLong(sc.next()));
    aPrimes.retainAll(bPrimes);
    pw.println(aPrimes.size() + 1);
  }

  static Set<Integer> primes(long n) {
    Set<Integer> ans = new HashSet<>();
    for (int i = 2; i <= n; i++) {
      if (n % i == 0) {
        ans.add(i);
        n = n / i;
        i = 1;
      }
    }
    return ans;
  }
}
