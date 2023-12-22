import java.util.*;

public class Main {
  public static long MOD = (long)Math.pow(10, 9) + 7;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    ArrayList<Long> list1 = new ArrayList<Long>();
    ArrayList<Long> list2 = new ArrayList<Long>();
    for(int i = 0; i < n; i++) {
      long a = sc.nextLong();
      if(a >= 0) {
        list1.add(a);
      } else {
        list2.add(a);
      }
    }
    Collections.sort(list1);
    Collections.sort(list2);
    int p1 = list1.size() - 1;
    int p2 = 0;
    int pp1 = -1;
    int pp2 = -1;
    long ans = 1;
    int mai = 0;
    if(list1.size() == 0) {
      if((k % 2) == 0) {
        for(int i = p2; i < p2 + k; i++) {
          long d = list2.get(i);
          d += MOD;
          ans = (ans * d) % MOD;
        }
      } else {
        p2 = list2.size() - 1;
        for(int i = p2; i > p2 - k; i--) {
          long d = list2.get(i);
          d += MOD;
          ans = (ans * d) % MOD;
        }
      }
    } else if(list2.size() == 0) {
      for(int i = p1; i > p1 - k; i--) {
        ans = (ans * list1.get(i)) % MOD;
      }
    } else {
    for(int i = 0; i < k; i++) {
      if(p1 >= 0) {
        if(p2 < list2.size()) {
          if(list1.get(p1) >= Math.abs(list2.get(p2))) {
            ans = (ans * list1.get(p1)) % MOD;
            pp1 = p1;
            p1--;
          } else {
            mai++;
            long d = list2.get(p2);
            pp2 = p2;
            d += MOD;
            p2++;
            ans = (ans * d) % MOD;
          }
        } else {
          ans = (ans * list1.get(p1)) % MOD;
          pp1 = p1;
          p1--;
        }
      } else {
        mai++;
        long d = list2.get(p2);
        pp2 = p2;
        d += MOD;
        p2++;
        ans = (ans * d) % MOD;
      }
    }
    if((mai % 2) == 1) {
      if(ans > 0) {
        if(pp1 == -1) {
          long d = list2.get(pp2);
          d += MOD;
          ans = (ans * func(d, MOD - 2)) % MOD;
          ans = (ans * list1.get(p1)) % MOD;
        } else {
          if(pp2 == -1) {
            long d = list2.get(p2);
            d += MOD;
            ans = (ans * func(list1.get(pp1), MOD - 2)) % MOD;
            ans = (ans * d) % MOD;
          } else {
            if(pp1 == 0) {
              if(pp2 < list2.size() - 1) {
                long d = list2.get(pp2 + 1);
                d += MOD;
                ans = (ans * func(list1.get(pp1), MOD - 2)) % MOD;
                ans = (ans * d) % MOD;
              }
            } else {
              if(pp2 == list2.size() - 1) {
                if(pp1 > 0) {
                  long d = list2.get(pp2);
                  d += MOD;
                  ans = (ans * func(d, MOD - 2)) % MOD;
                  ans = (ans * list1.get(pp1 - 1)) % MOD;
                }
              } else {
                long d1 = list2.get(pp2);
                d1 += MOD;
                long d2 = list2.get(pp2 + 1);
                d2 += MOD;
                long t1 = (ans * func(list1.get(pp1), MOD - 2)) % MOD;
                long t2 = (ans * func(d1, MOD - 2)) % MOD;

                t1 = (t1 * d2) % MOD;
                t2 = (t2 * list1.get(pp1 - 1)) % MOD;

                if((list2.get(pp2) * list2.get(pp2 + 1)) <= (list1.get(pp1) * list1.get(pp1 - 1))) {
                  ans = t1;
                } else {
                  ans = t2;
                }
              }
            }
          }
        }
      }
    }
    }
    System.out.println(ans);
  }

  public static long func(long a, long x) {
    if(x == 0) return 1;
    if((x % 2) == 0) {
      long t = func(a, x / 2);
      return (t * t) % MOD;
    } else {
      return (a * func(a, x - 1)) % MOD;
    }
  }
}