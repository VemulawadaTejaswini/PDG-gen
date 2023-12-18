import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
  	public static void main(String[] args){
      //入力値の取得
      Scanner sc = new Scanner(System.in);
      Double n = Double.valueOf(sc.next());
      Double a = Double.valueOf(sc.next());
      Double b = Double.valueOf(sc.next());
      sc.close();

      if (a==0 && b==0) {
    	  System.out.println(0);
    	  return;
      }

      double answer = n/(a+b)*a;
      if (n%(a+b) <a) {
    	  answer+=n%(a+b);
      } else {
    	  answer+=a;
      }

      System.out.println(String.format("%.0f", BigDecimal.valueOf(answer)));
  	}
}