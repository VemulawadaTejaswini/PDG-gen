import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * E - ∙ (Bullet)
 * https://atcoder.jp/contests/abc168/tasks/abc168_e
 */
public class Main {
  static int MOD = 1000000007;
  public static void main(String[] args) {
    long answer = 1;
    int zero = 0;
    int xzero = 0;
    int yzero = 0;
    Map<String, Tuple> map = new HashMap<>();
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());
    long[] p2 = new long[n + 1];
    p2[0] = 1;
    for(int i = 1; i <= n; i++){
      p2[i] = p2[i-1] * 2 % MOD;
    }

    for(int i = 0; i < n; i++){
      String[] ab = sc.nextLine().split(" ");
      long x = Long.parseLong(ab[0]);
      long y = Long.parseLong(ab[1]);
      if(x == 0 && y == 0){
        zero++;
        continue;
      } else if (x == 0){
        xzero++;
      } else if (y == 0){
        yzero++;
      } else {
        if(y < 0){
          x = -x;
          y = -y;
        }
        long g = gcd(Math.abs(x),Math.abs(y));
        x /= g;
        y /= g;
        String key;
        if(x < 0){
          key = String.valueOf(y) + "/" + String.valueOf(-x) ;
        } else {
          key = String.valueOf(x) + "/" + String.valueOf(y) ;
        }
        if(map.containsKey(key)){
          Tuple tuple = map.get(key);
          if(x < 0){
            tuple.b += 1;
          } else {
            tuple.a += 1;
          }
        } else {
          Tuple tuple = new Tuple();
          if(x < 0){
            tuple.b += 1;
          } else {
            tuple.a += 1;
          }
          map.put(key, tuple);
        }
      }
    }
    answer = answer * (p2[xzero] + p2[yzero] -1) % MOD;
    Collection<Tuple> valueList = map.values();
    for(Tuple tuple : valueList){
      long tmp = p2[tuple.a] + p2[tuple.b] - 1;
      answer = answer * tmp % MOD;
    }
    answer = (answer + zero + MOD - 1) % MOD;
    System.out.print(answer);
  }
  static long gcd(long a, long b){
    return b > 0 ? gcd(b, a % b) : a;
  }
  static class Tuple {
    int a = 0;
    int b = 0;
  }

}