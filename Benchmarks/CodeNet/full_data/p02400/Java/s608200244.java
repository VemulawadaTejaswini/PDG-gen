import java.util.*;
import java.math.*;

class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int r = scanner.nextInt();
	double x=Math.PI;
	BigDecimal circArea = new BigDecimal(r*r*x);
	circArea.setScale(5);
	BigDecimal circFere = new BigDecimal(2*r*x);
	circFere.setScale(5);
	System.out.println(circArea.toPlainString()+" "+circFere.toPlainString());
  }
}