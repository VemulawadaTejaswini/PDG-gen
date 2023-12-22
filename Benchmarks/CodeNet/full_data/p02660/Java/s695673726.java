import java.util.*;

class Main {

  private static boolean isSosu(long value) {
    if (value < 2) {
      return false;
    }
    for (long i = 2; i < value; i++) {
      if (value % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static boolean isPrime(long num) {
    if (num < 2)
      return false;
    else if (num == 2)
      return true;
    else if (num % 2 == 0)
      return false; // 偶数はあらかじめ除く

    double sqrtNum = Math.sqrt(num);
    for (long i = 3; i <= sqrtNum; i += 2) {
      if (num % i == 0) {
        // 素数ではない
        return false;
      }
    }

    // 素数である
    return true;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    long n = sc.nextLong();
    sc.close();

    Map<Long, Integer> map = new HashMap<Long, Integer>();
    long count = 0;
    while (true) {
      boolean check = false;
      for (long p = 2; p <= n; p++) {
        if (n % p == 0 && isPrime(p)) {
          if (map.get(p) == null) {
            map.put(p, 1);
            count++;
            n = n / p;
            if (n == 1) {
              System.out.println(count);
              return;
            }
            check = true;
            break;
          } else {
            long p2 = p;
            int e = map.get(p) + 1;
            for (int i = 1; i < e; i++) {
              p2 *= p;
            }
            if (n % p2 == 0) {
              map.replace(p, e);
              count++;
              n = n / p2;
              if (n == 1) {
                System.out.println(count);
                return;
              }
              check = true;
              break;
            }
          }
        }
      }
      if (check == false) {
        break;
      }
    }
    System.out.println(count);
  }
}