import java.util.HashMap;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long mod = 1000000007l;
    long answer = 1l;
    int zeroCnt = 0;
    Tupple zeroTupple = new Tupple();
    HashMap<String, Tupple> map = new HashMap<>();
    long[] p2table = new long[n + 1];
    p2table[0] = 1;
    for(int i = 1; i <= n; i++){
      p2table[i] = p2table[i-1] * 2 % mod;
    }
    for(int i = 0; i < n; i++){
      long a = sc.nextLong();
      long b = sc.nextLong();
      if(a == 0 && b == 0){
        zeroCnt++;
        continue;
      }
      if(a == 0) {
        zeroTupple.a++;
        continue;
      }
      if(b == 0) {
        zeroTupple.b++;
        continue;
      }
      if(b < 0){
        a = -a;
        b = -b;
      }
      long gcd = gcd(Math.abs(a), Math.abs(b));
      a /= gcd;
      b /= gcd;
      String key;
      if(a > 0){
        key = a + "/" + b;
      } else {
        key = b + "/" + (-a);
      }
      if(map.containsKey(key)){
        Tupple t = map.get(key);
        if(a > 0){
          t.a++;
        } else {
          t.b++;
        }
      } else {
        Tupple t = new Tupple();
        if(a > 0){
          t.a++;
        } else {
          t.b++;
        }
        map.put(key, t);
      }
    }
    map.put("0", zeroTupple);
    for(Tupple t : map.values()){
      long ans = p2table[t.a] + p2table[t.b] - 1;
      answer = answer * ans % mod;
    }
    answer = (answer + zeroCnt + mod - 1) % mod;
    System.out.println(answer);
  }

  static long gcd(long a, long b){
    if(b == 0){
      return a;
    }
    return gcd(b, a % b);
  }
  static class Tupple {
    int a = 0;
    int b = 0;
  }
}