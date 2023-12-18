import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long K = sc.nextLong();
    long[] A = new long[N];
    int[] bitNum = new int[64];
    for (int i = 0; i < N; i++) {
      long a = sc.nextLong();
      A[i] = a;
      int j = 0;
      while (a > 0) {
        bitNum[j++] += a%2;
        a >>= 1;
      }
    }
    
    int i = 0;
    int[] bitK = new int[64];
    while (K > 0) {
      bitK[i++] = (int) K%2;
      K >>= 1;
    }
    
    boolean any = false;
    long x = 0;
    while (--i >= 0) {
      int b;
      if (bitNum[i] >= (N+1)/2) {
        b = 0;
      } else {
        b = 1;
      }
      x <<= 1;
      if (any) {
        x |= b;
      } else {
        if (b == 0 && bitK[i] == 1) {
          any = true;
        } else {
          x |= bitK[i];
        }
      }
    }
    
    long ans = 0;
    for (int j = 0; j < N; j++) {
      ans += x ^ A[j];
    }
    
    System.out.println(ans);
  }
}