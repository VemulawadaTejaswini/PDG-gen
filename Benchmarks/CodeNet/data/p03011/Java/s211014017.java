import java.util.*;

class Main {
	  static int mod=1_000_000_007;
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
      long P = sc.nextLong();
      long Q = sc.nextLong();
      long R = sc.nextLong();
 
      
      
	  System.out.println(P+Q+R-Math.max(P, Math.max(Q, R)));
  }
  
 
}
