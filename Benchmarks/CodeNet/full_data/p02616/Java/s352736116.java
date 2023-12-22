import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    long MOD = (long)Math.pow(10, 9) + 7;
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
    long ans = 1;
    int p1 = list1.size() - 1;
    int p2 = 0;
    if(list1.size() == 0) {
      if((k % 2) == 1) {
        for(int i = list2.size() - 1; i >= list2.size() - k; i--) {
          long d = list2.get(i);
          d += MOD;
          ans = (ans * d) % MOD;
        }
      } else {
        for(int i = 0; i < k; i++) {
          long d = list2.get(i);
          d += MOD;
          ans = (ans * d) % MOD;
        }
      }
    } else if(list2.size() == 0) {
      for(int i = list1.size() - 1; i >= list1.size() - k; i--) {
        ans = (ans * list1.get(i)) % MOD;
      }
    } else {
    for(int i = 0; i < k; i++) {
      if(p2 < list2.size() - 1) {
        long s1 = list1.get(p1);
        if(p1 > 0) s1 *= list1.get(p1 - 1);
        long t1 = 1;
        //long t1 = list2.get(p2);
        long t2 = 1;
        //if(p2 < list2.size() - 1) t2 = list2.get(p2 + 1);
        long s2 = t1 * t2;
        
        if((p1 >= 0) && ((s1 >= s2) || (i == (k - 1)))) {
          ans = (ans * list1.get(p1)) % MOD;
          p1--;
        } else {
          s2 = (s2 % MOD);
          ans = (ans * s2) % MOD;
          i++;
          p2 = p2 + 2;
        }
      } else {
        if(p1 >= 0) {
          long d = list1.get(p1);
          ans = (ans * d) % MOD;
          p1--; 
        } else {
          long d = list2.get(p2);
          d += MOD;
          ans = (ans * d) % MOD;
          p2++; 
        }
      }
    } 
    }
    System.out.println(ans);
  }
}