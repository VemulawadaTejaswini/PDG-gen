import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    long N = sc.nextLong();

    sc.close();

    int digits = countDigits(N);

    for (long A = 1; A * A <= N; A++) {
      if (N % A != 0) {
        continue;
      }
      long B = N / A;
      int digits_ = Math.max(countDigits(B), countDigits(A));
      digits = Math.min(digits, digits_);
    }

    System.out.println(digits);
    
  }

  static int countDigits(long N){
    
    int digits = 0;

    while (0 < N) {
      N /= 10;
      digits++;
    }
    
    return digits;
  
  }

}