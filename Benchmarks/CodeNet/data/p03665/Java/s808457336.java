import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int P = sc.nextInt();
    int odd = 0;
    for (int i = 0; i < N; i++) {
      if (sc.nextInt()%2 == 1) odd++;
    }
    
    int even = N-odd;
    long evenComb = 0;
    for (int i = 0; i <= even; i++) {
      evenComb += comb(even, i);
    }
    
    long oddComb = 0;
    for (int i = 1; i <= odd; i+=2) {
      oddComb += comb(odd, i)*evenComb;
    }
    
    System.out.println(P == 1
      ? oddComb : (1L<<N)-oddComb);
  }
  private static long comb(int n, int r) {
    if (r == 0) {
      return 1;
    } else {
      return comb(n, r-1)*(n-r+1)/r;
    }
  }
}