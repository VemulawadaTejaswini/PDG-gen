import java.util.*;
import java.util.stream.*;
import java.math.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    List<Long> primeList = getPrimeList(N);
    List<Long> usedList = new ArrayList<>();
    int s = 0;
    long n = 1;
    while(s < primeList.size()) {
      //System.out.println("s :" + s + " " + usedList.toString());
      n *= primeList.get(s);
      if (!usedList.contains(n)) {
        usedList.add(n);
        n = 1;
      }
      s++;
    }
    //System.out.println(usedList.toString());
    System.out.println(N == 1 ? 0 : usedList.size());
  }
  
  static ArrayList<Long> getPrimeList(long n) {
    ArrayList<Long> ret = new ArrayList<>();
    while(true) {
      for (long i = 2; i <= (long)(Math.ceil(Math.sqrt(n))); i++) {
        if (n % i == 0) {
          ret.add(i);
          n /= i;
          break;
        }
      }
      if (isPrime(n)) {
        ret.add(n);
        break;
      }
    }
    //System.out.println(ret.toString());
    return ret;
  }
  
  static boolean isPrime(long n) {
    if (n == 2) return true;
    if (n % 2 == 0) return false;
    long sq = (long)Math.sqrt(n);
    for (long i = 3; i <= sq; i++) {
      if (n % i == 0) return false;
    }
    return true;
  }
}
