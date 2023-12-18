import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    long N = sc.nextLong();
    long a = 0;
    long c_N = N;
    
    while (N != 0) {
      a += N % 10;
      N /= 10;
    }
    
    System.out.println(a % c_N == 0 ? "Yes" : "No");
  }
}
