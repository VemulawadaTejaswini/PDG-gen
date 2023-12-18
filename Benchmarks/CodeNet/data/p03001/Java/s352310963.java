import java.math.BigDecimal;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int ww = scan.nextInt();
		int hh = scan.nextInt();
      int xx = scan.nextInt();
		int yy = scan.nextInt();
      double a = 1.0;
      BigDecimal w = BigDecimal.valueOf(ww);
      BigDecimal h = BigDecimal.valueOf(hh);
      BigDecimal x = BigDecimal.valueOf(xx);
      BigDecimal y = BigDecimal.valueOf(yy);
      BigDecimal b = BigDecimal.valueOf(yy);
      BigDecimal c = BigDecimal.valueOf(yy);
      if(w.multiply(y).compareTo(w.multiply(h.subtract(y))) < 0) {

    	  b = w.multiply(y);
      }else {
    	  b = w.multiply(h.subtract(y));
      }
      if(h.multiply(x).compareTo(h.multiply(w.subtract(x))) < 0) {

    	  c = h.multiply(x);
      }else {
    	  c = h.multiply(w.subtract(x));
      }

      if(b==c) {
    	  System.out.print(b+" "+1);
      }else if (b.compareTo(c) < 0) {
    	  System.out.print(c+" "+0);
      }else {
    	  System.out.print(b+" "+0);
      }

      
	}
 
}