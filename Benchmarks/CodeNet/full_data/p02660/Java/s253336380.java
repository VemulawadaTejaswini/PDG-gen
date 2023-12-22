import java.util.HashMap;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    long n = sc.nextLong();
    HashMap<Long, Integer> map = new HashMap<Long, Integer>();
    long res = 0;

    long devideNum = 2;
    while (n % devideNum == 0) {
      if (map.containsKey(devideNum)) {
        map.put(devideNum, (map.get(devideNum)) + 1);
      } else {
        map.put(devideNum, 1);
      }
      n /= 2;
    }

    devideNum++;
    while ((n != 1) && (devideNum <= Math.sqrt(n))) {
      if (isPrime(devideNum)) {
        if (n % devideNum == 0) {
          if (map.containsKey(devideNum)) {
            map.put(devideNum, (map.get(devideNum)) + 1);
          } else {
            map.put(devideNum, 1);
          }
          n /= devideNum;
        } else {
          devideNum += 2;
        }
      } else {
        devideNum += 2;
      }
    }
    
    if (map.isEmpty()) {
      System.out.println(1);
    } else {
      for (long key : map.keySet()) {
        int tmp = map.get(key);
        int i = 1;
        while (true) {
          if (tmp - i >= 0) {
            tmp -= i;
            i++;
            res++;
          } else {
            break;
          }
        }
      }
      System.out.println(res);
    }

  }

  static boolean isPrime(long n) {

    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }
}