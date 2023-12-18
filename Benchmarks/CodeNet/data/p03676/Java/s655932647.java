import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static final long mod7 = 1000000007L;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    ArrayList<Integer> a = new ArrayList<>();
    int[] b = new int[n + 1];
    int dup = 0;
    sc.nextLine();
    String line = sc.nextLine();
    String[] vs = line.split(" ");
    for (int i = 0; i < vs.length; i++) {
      int v = Integer.parseInt(vs[i]);
      a.add(v);
      b[v] ++;
      if (b[v] == 2) {
        dup = v;
      }
    }
    int l = a.indexOf(dup);
    int r = a.lastIndexOf(dup);
    int t = ( a.size() - r ) + l - 1;
    for (int i = 1; i <= a.size(); i++) {
      long all = modComb(a.size(), i, mod7);
      long diff = modComb(t, i - 1, mod7);
      System.out.println(all - diff);
    }
  }

  // mod combination
  static long modComb(long a, long b, long mod) {
    long res = 1;
    for (long i = a; i > a - b; i--) {
      res = (res * i) % mod;
    }
    for (long i = b; i > 1; i--) {
      res = (res * inv(i, mod)) % mod;
    }
    return res;
  }

  static long inv(long a, long mod) {
    return powMod(a, mod - 2, mod);
  }

  // a ^ b (mod p)
  static long powMod(long a, long b, long p) {
    if (b == 0) {
      return 1;
    }
    if (b % 2 == 0) {
      long d = powMod(a, b / 2, p);
      return d * d % p;
    }
    return a * powMod(a, b - 1, p) % p;
  }
}
