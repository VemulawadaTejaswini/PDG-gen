import java.util.*;
public class Main {
  static int MOD = 1000000007;
  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      String n = sc.next();
      char[] digits = new char[n.length()];
      for(int i = 0; i < n.length(); i++)
        digits[i] = '0';

      long cnt = 0;

      int oneCnt = 0;
      while(!n.equals(new String(digits))) {
        oneCnt = 0;
        for(int i = 0; i < n.length(); i++) {
          if(digits[i] == '1')
            oneCnt++;
        }
        cnt = (cnt + powMod(2, oneCnt)) % MOD;
        plusOne(digits);
      }

      oneCnt = 0;
      for(int i = 0; i < n.length(); i++) {
        if(digits[i] == '1')
          oneCnt++;
      }
      cnt = (cnt + powMod(2, oneCnt)) % MOD;

      System.out.println(cnt);
  }

  static long powMod(long a, int b) {
    if(b == 0)
      return 1;
    if(b == 1)
      return a % MOD;
    long res = powMod(a, b/2);
    if(b % 2 == 1)
      return (res * res % MOD) * a % MOD;
    else
      return (res * res % MOD);
  }

  static void plusOne(char[] digits) {
    int carry = 1;
    for(int i = digits.length - 1; i >= 0; i--) {
      int sum = (digits[i] - '0') + carry;
      digits[i] = (char)((sum % 2) + '0');
      carry = sum / 2;
    }
  }
}