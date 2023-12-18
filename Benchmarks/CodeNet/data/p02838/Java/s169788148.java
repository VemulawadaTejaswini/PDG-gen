import java.util.*;
public class Main {
  static int mod = 1_000_000_007;
  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      long[] arr = new long[n];
      for(int i = 0; i < n; i++)
        arr[i] = sc.nextLong();
      long[] kCnt = new long[60];
      for(long num : arr) {
        int digit = 0;
        while((num >> digit) > 0) {
          if(((num >> digit) & 1) == 1)
            kCnt[digit]++;
          digit++;
        }
      }
      
      long res = 0L;
      for(int i = 0; i < kCnt.length; i++)
        res = (res + (kCnt[i] * (n - kCnt[i]) % mod) * modPow(2, i)) % mod;
      System.out.println(res);
  }

  private static long modPow(int a, int b) {
    if(b == 0) return 1;
    if(b == 1) return a;
    long res = modPow(a, b/2) % mod;
    if(b % 2 == 0)
      return res * res % mod;
    return (res * res % mod) * a % mod; 
  }
}