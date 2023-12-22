import java.util.*;

public class Main {

  static Map<Long, Long> cCoin;
  static long cheapest = 0;
  static long N, A, B, C, D = 0;
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int T = sc.nextLong();
    
    for (int i = 0; i < T; i++) {
      
      N = sc.nextLong();
      A = sc.nextLong();
      B = sc.nextLong();
      C = sc.nextLong();
      D = sc.nextLong();
      
      cCoin = new HashMap<>();
      cheapest = Integer.MAX_VALUE;
      
      t(1, D);
      
      System.out.println(cheapest);
      
    }
    
    
  }
    
  static void t(long num, long coin) {
  
    if (num <= 0 || N * 5 <= num)
      return;
  
    if (cCoin.containsKey(num) && cCoin.get(num) < coin)
      return;
  
    cCoin.put(num, coin);
  
    if (N == num)
      cheapest = Math.min(cheapest, coin);
  
    else {
      t(num * 2, coin + A);
      t(num * 3, coin + B);
      t(num * 5, coin + C);
      t(num + 1, coin + D);
      t(num - 1, coin + D);
    }
  
  }

}