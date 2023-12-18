import java.util.*;
import java.math.BigDecimal;

public class Main {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    long A = sc.nextLong();
    long B = sc.nextLong();
    long K = sc.nextLong();
    
    long n1 = K - A;
    long n2 = 0;
    if(n1 >= 0){
      n2 = B - n1;
      System.out.println(0 + " " + n2);
    } else {
      System.out.println(n1 + " " + n2);
    }
  }
}
