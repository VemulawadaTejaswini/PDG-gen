import java.math.BigDecimal;
import java.util.Scanner;


public class Main{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			ORLine l1 = new ORLine(sc.next(), sc.next(), sc.next(), sc.next());
			ORLine l2 = new ORLine(sc.next(), sc.next(), sc.next(), sc.next());
			
			if(orthogonal(l1, l2)) System.out.println("YES");
			else System.out.println("NO");
		}
		sc.close();
	}
	
	static boolean orthogonal(ORLine l1, ORLine l2) {
		if(l1.a.multiply(l2.a).compareTo(l1.b.multiply(l2.b).negate()) == 0) return true;
		else return false;
	}
}

class ORLine{
	BigDecimal a;
	BigDecimal b;
	
	ORLine(String xa, String ya, String xb, String yb){
		a = new BigDecimal(ya).subtract(new BigDecimal(yb));
		b = new BigDecimal(xb).subtract(new BigDecimal(xa));
	}
}