import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long A = sc.nextLong();
    long B = sc.nextLong();
    long K = sc.nextLong();
    
    if (A > K) {
      A -= K;
    } else if (A < K) {
      K -= A;
      A = 0;
      B -= K;
    }
    System.out.print(A + " " + B + K);
  }
}