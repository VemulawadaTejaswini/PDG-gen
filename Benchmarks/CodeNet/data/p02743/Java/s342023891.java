import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sn = new Scanner(System.in);
		String[] abc= sn.nextLine().split(" ");

		sn.close();
		BigDecimal a = BigDecimal.valueOf(Math.sqrt(Integer.valueOf(abc[0])));
		BigDecimal b = BigDecimal.valueOf(Math.sqrt(Integer.valueOf(abc[1])));
		BigDecimal c = BigDecimal.valueOf(Math.sqrt(Integer.valueOf(abc[2])));

		int result = c.compareTo(a.add(b));
		if(result == 1) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}

}