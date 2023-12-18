import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    int M = sc.nextInt();

    sc.close();

    long mod = 1000000007;

    long result = 0;

    if (Math.abs(N - M) < 2) {
      if (N == M) {
        result += count(N) * count(M) * 2;
      } else {
        result += count(N) * count(M);
      } 
    }

    System.out.println(result % mod);

  }

  public static long count(int n) {
    
    long v = 1;

    for (int i = 0; i < n; i++) {
      v *= i + 1;
      v %= 1000000007;
    }
    
    return v;

  }

}
