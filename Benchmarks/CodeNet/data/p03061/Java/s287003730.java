import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] A = new int[N];
    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
    }

    Map<Set<Integer>, Integer> memo = new HashMap<>();
    int maxGcd = 1;
    for (int i = 0; i < N; i++) {
      int l = gcdDiv(A, 0, i-1, memo);
      int r = gcdDiv(A, i+1, N-1, memo);
      int val;
      if (l > r) {
        val = gcd(l, r, memo);
      } else {
        val = gcd(r, l, memo);
      }

      if (val > maxGcd) {
        maxGcd = val;
      }
    }

    System.out.println(maxGcd);
  }
  
  private static int gcdDiv(int[] A, int start, int end, Map<Set<Integer>, Integer> memo) {
    if (start > end) {
      return 0;
    }
    if (start == end) {
      return A[start];
    }
    int l = gcdDiv(A, start, (start+end)/2, memo);
    int r = gcdDiv(A, (start+end)/2 + 1, end, memo);
    if (l > r) {
      return gcd(l, r, memo);
    } else {
      return gcd(r, l, memo);
    }
  }
  
  private static int gcd(int a, int b, Map<Set<Integer>, Integer> memo) {

    // a > b
    if (b == 0) {
      return a;
    }

    Set<Integer> key = new HashSet<>();
    key.add(a);
    key.add(b);
    Integer cachedValue = memo.get(key);
    if (cachedValue != null) {
      return cachedValue;
    }

    int value = gcd(b, a % b, memo);
    memo.put(key, value);
    return value;
  }
}