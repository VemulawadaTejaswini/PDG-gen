import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();

    int digitNum = calcNumDigits(N);
    
    int ans = 0;
    for (int i = digitNum; i >= 3; i--) {
      ans += solve(N, i, 0, false, false, false);
    }
    
    System.out.println(ans);
  }
  
  private static int solve(int N, int digit, int num,
                          boolean use7, boolean use5, boolean use3) {
    if (digit == 0) {
      if (use7 && use5 && use3 && num <= N) {
        return 1;
      }  else {
        return 0;
      }
    }
    
    int ans = 0;
    // 7
    ans += solve(N, digit-1, num+7*power10(digit-1), true, use5, use3);
    // 5
    ans += solve(N, digit-1, num+5*power10(digit-1), use7, true, use3);
    // 3
    ans += solve(N, digit-1, num+3*power10(digit-1), use7, use5, true);
    
    return ans;
  }

  private static HashMap<Integer, Integer> memo = new HashMap<>();
  private static int power10(int n) {
    if (n == 0) {
      return 1;
    }
    Integer cached = memo.get(n);
    if (cached != null) {
      return cached;
    }
    int val = 10 * power10(n-1);
    memo.put(n, val);
    return val;
  }
  
  private static int calcNumDigits(int n) {
    int ret = 0;
    while (n > 0) {
      ret++;
      n /= 10;
    }
    return ret;
  }
}