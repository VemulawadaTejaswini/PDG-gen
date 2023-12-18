import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    long M = sc.nextLong();
    
    // Scc
    long a = Math.min(N, M/2);
    N -= a;
    M -= 2*a;
    
    // cc > S, Scc
    long b = M/4;
    
    System.out.println(a + b);
  }
}