import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    long A = scanner.nextLong();
    long B = scanner.nextLong();
    int[] primes = primes(1000000);
    Set<Long> aFactors = primeFactors(A, primes);
    Set<Long> bFactors = primeFactors(B, primes);
    int count = 0;
    for (long f : aFactors) {
      if (bFactors.contains(f)) count++;
    }
    System.out.println(count);
  }

  private static int[] primes(int num) {
    boolean[] isPrime = new boolean[num + 1];
    Arrays.fill(isPrime, true);
    isPrime[0] = false;
    isPrime[1] = false;
    for (int i = 2; i <= num; i++) {
      if (isPrime[i]) {
        for (int j = i * 2; j <= num; j += i) {
          isPrime[j] = false;
        }
      }
    }
    List<Integer> list = new ArrayList<>();
    for (int i = 1; i <= num; i++) {
      if (isPrime[i]) list.add(i);
    }
    int[] res = new int[list.size()];
    for (int i = 0; i < list.size(); i++) {
      res[i] = list.get(i);
    }
    return res;
  }

  private static Set<Long> primeFactors(long num, int[] primes) {
    Set<Long> res = new HashSet<>();
    res.add(1L);
    for (int i = 0; i < primes.length && num > 1; i++) {
      if (num % primes[i] == 0) {
        res.add((long) primes[i]);
        while (num % primes[i] == 0) num /= primes[i];
      }
    }
    res.add(num);
    return res;
  }
}
