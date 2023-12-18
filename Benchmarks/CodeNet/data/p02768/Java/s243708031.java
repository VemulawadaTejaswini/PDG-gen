import java.util.*;
import java.math.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    
   	long res = (long)Math.pow(2, n) % 1000000007; 
    --res;
    int cur = 1;
    int div = 1;
    for(int i = 1; i <= a; ++i) {
      cur *= (n - i + 1) % 1000000007;
      div *= i % 1000000007;
    }
    res -= cur / div;
    cur = 1;
    div = 1;
    for(int i = 1; i <= b; ++i) {
      cur *= (n - i + 1) % 1000000007;
      div *= i % 1000000007;
    }
    res -= cur / div;
    System.out.println(res);
  }
}