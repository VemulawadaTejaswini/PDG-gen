import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int K = sc.nextInt();
    int A = sc.nextInt();
    int B = sc.nextInt();

    if (K < A) {
      System.out.println(1 + K);
      return;
    }    
    if (B - A <= 2) {
      System.out.println(K+1);
      return;
    }

    long n = 1;
    K -= A-1;
    n += A-1;
    n += (long)K/2 * (B-A);
    if (K%2 == 1) {
      n++;
    }
    
    System.out.println(n);
  }
}