import java.util.*;

public class Main {

  static Scanner scan = new Scanner(System.in);

  static long mod = 1000000007;
  static long ans = 0;

  public static void main(String[] args) {
    int n = scan.nextInt();

    long ans = 1;
    long saved = 0;

    Map<String, Long> map = new HashMap<>();

    for (int i = 0; i < n; i++) {
      long a = scan.nextLong();
      long b = scan.nextLong();

      if (a ==0 && b == 0) {
        saved++;
        continue;
      }
      if (a == 0) {
        map.putIfAbsent("0", 0L);
        map.put("0", map.get("0") + 1);
        continue;
      }
      if (a == 0) {
        map.putIfAbsent("/0", 0L);
        map.put("/0", map.get("/0") + 1);
        continue;
      }

      long g = gcd(a, b);
      a /= g;
      b /= g;

      boolean neg = a * b < 0;

      if (!neg) {
        String key = a + "/" + b;
        map.putIfAbsent(key, 0L);
        map.put(key, map.get(key) + 1);
        continue;
      }
      if (a < 0) a *= -1;
      if (b < 0) b *= -1;

      String key = "-" + a + "/" + b;
      map.putIfAbsent(key, 0L);
      map.put(key, map.get(key) + 1);
    }

    // for (String key : map.keySet()) {
    //   System.out.println(key + " " + map.get(key));
    // }

    Map<String, List<Long>> counts = new HashMap();
    String zero = "0";
    counts.put(zero, new ArrayList<>());
    counts.get(zero).add(0L);
    counts.get(zero).add(0L);
    if (map.containsKey("0")) {
      counts.get(zero).set(0, map.get("0"));
    }
    if (map.containsKey("/0")) {
      counts.get(zero).set(1, map.get("/0"));
    }

    map.remove("0");
    map.remove("/0");

    for (String key: map.keySet()) {
      boolean neg = false;
      String nextKey = key;
      if (key.startsWith("-")) {
        neg = true;
        nextKey = reverseNeg(key);
      }

      if (!counts.containsKey(nextKey)) {
        List<Long> list = new ArrayList<>();
        list.add(0L);
        list.add(0L);
        counts.put(nextKey, list);
      }
      int ind = neg ? 1 : 0;

      counts.get(nextKey).set(ind, counts.get(nextKey).get(ind) + 1);
    }

    // for (String key : counts.keySet()) {
    //   System.out.println(key + " " + counts.get(key));
    // }

    for (String key: counts.keySet()) {
      long a = calc(counts.get(key).get(0));
      long b = calc(counts.get(key).get(1));

      a = (a + b) % mod;

      // System.out.println(key + " " + ans + " " + (ans * a) % mod);
      ans += (ans * a) % mod;
    }

    // System.out.println(ans);
    add(mod - 1);
    ans -= 1;
    if (ans == -1) {
      ans = mod - 1;
    }
    // System.out.println(ans);
    add(saved);
    // System.out.println(ans);
    System.out.println(ans);
  }

  private static long calc(Long a) {
    if (a < 2) {
      return a;
    }
    long ret = 1;
    for (int i = 1; i <= a; i++) {
      ret *= 2;
      ret %= mod;
    }
    ret += mod - 1;
    ret %= mod;
    return ret;
  }

  private static String reverseNeg(String key) {
    key = key.substring(1);
    String[] ar = key.split("/");
    return ar[1] + "/" + ar[0];
  }

  public static void add(long n) {
    ans += n;
    ans %= mod;
  }

  public static long gcd(long n1, long n2) {
    if (n2 == 0) {
      return n1;
    }
    return gcd(n2, n1 % n2);
  }
}