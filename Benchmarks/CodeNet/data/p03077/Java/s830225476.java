import java.util.*;
import java.math.BigDecimal;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		BigDecimal N = nextBigDecimal(sc);
		BigDecimal minMovePeople = nextBigDecimal(sc);
		for (int i = 1; i < 5; i++) {
		    BigDecimal current = nextBigDecimal(sc);
		    if (current.compareTo(minMovePeople) < 0) { 
		        minMovePeople = current;
		    }
		}
		BigDecimal result = N.divide(minMovePeople);
		BigDecimal result2 = result.setScale(0, java.math.RoundingMode.DOWN);
		System.out.println(result2.add(new BigDecimal("5")));
	}
	
	public static BigDecimal nextBigDecimal(Scanner sc) {
	    return new BigDecimal(sc.next());
	}
}