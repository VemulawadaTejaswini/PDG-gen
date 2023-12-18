import java.util.*;
import java.math.BigDecimal;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		BigDecimal N = next(sc);
		BigDecimal minMovePeople = next(sc);
		for (int i = 1; i < 5; i++) {
		    BigDecimal current = next(sc);
		    if (current.compareTo(minMovePeople) < 0) { 
		        minMovePeople = current;
		    }
		}
		BigDecimal result = N.divide(minMovePeople);
		BigDecimal result2 = result.setScale(0, BigDecimal.ROUND_DOWN);
		System.out.println(result2.add(new BigDecimal("5")));
	}
	
	public static BigDecimal next(Scanner sc) {
		long s = sc.nextLong();
	    return new BigDecimal(s);
	}
}