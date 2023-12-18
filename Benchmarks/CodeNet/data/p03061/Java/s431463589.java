import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] A = new int[N];
    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
    }

    int maxGcd = 1;
    for (int i = 0; i < N; i++) {
      int tmp = A[i];
      A[i] = A[(i+1) % N];
      int val = gcdDiv(A, 0, N-1);
      A[i] = tmp;
      if (val > maxGcd) {
        maxGcd = val;
      }
    }

    System.out.println(maxGcd);
  }
  
  private static int gcdDiv(int[] A, int start, int end) {
    if (start == end) {
      return A[start];
    }
    int l = gcdDiv(A, start, (start+end)/2);
    int r = gcdDiv(A, (start+end)/2 + 1, end);
    if (l > r) {
      return gcd(l, r);
    } else {
      return gcd(r, l);
    }
  }
  
  private static int gcd(int a, int b) {
    // a > b
    if (b == 0) {
      return a;
    }
    return gcd(b, a % b);
  }
}