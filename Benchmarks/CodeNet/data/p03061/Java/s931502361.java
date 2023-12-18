import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }

    int maxGcd = 0;
    for (int i = 0; i < n; i++) {
      int gcdValue = 0;
      for (int j = 0; j < n; j++) {
        if (j == i) {
          // skip
          continue;
        }
        if (gcdValue != 0 && a[j] % gcdValue == 0) {
          continue;
        }
        //System.out.println("j="+ j + ", " + gcdValue);
        if (a[j] > gcdValue) {
          gcdValue = gcd(a[j], gcdValue);
        } else {
          gcdValue = gcd(gcdValue, a[j]);
        }
        if (gcdValue <= maxGcd) {
          break;
        }
      }
      //System.out.println("i="+ i + ", " + gcdValue);
      maxGcd = Math.max(maxGcd, gcdValue);
    }
    
    System.out.println(maxGcd);
  }
  
  private static Map<Set<Integer>, Integer> memo = new HashMap<>();
  
  private static int gcd(int a, int b) {
    if (b == 0) {
      return a;
    }
    Set<Integer> key = new HashSet<>();
    key.add(a);
    key.add(b);
    Integer cachedValue = memo.get(key);
    if (cachedValue != null) {
      //System.out.println("###"+"a " + a+ ", b " + b + ": " +cachedValue);
      return cachedValue;
    }
    int value = gcd(b, a % b);
    //System.out.println("$$$"+"a " + a+ ", b " + b + ": " +value);
    memo.put(key, value);
    return value;
  }
}