import java.util.Scanner;
import java.math.BigInteger;

public class Main {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int q = sc.nextInt();
    
    StringBuilder sb = new StringBuilder();
    for(int i = 0; i < n; i++) {
      sb.append('1');
    }
    
    BigInteger mod = BigInteger.valueOf(998244353);
    
    for(int i = 0; i < q; i++) {
      int l = sc.nextInt();
      int r = sc.nextInt();
      int d = sc.nextInt();
      for(int j = l; j <= r; j++) {
        sb.setCharAt(j - 1, (char) ('0' + d));
      }
      
      BigInteger bi = new BigInteger(sb.toString());
      System.out.println(bi.remainder(mod));
    }
  }
}