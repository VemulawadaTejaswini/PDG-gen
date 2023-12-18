import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		
		int b = scanner.nextInt();
		
		int c = scanner.nextInt();
		
		scanner.close();
		
		BigDecimal one = BigDecimal.valueOf(Math.sqrt(a) + Math.sqrt(b));
		BigDecimal two = BigDecimal.valueOf(Math.sqrt(c));
		
		if (one.compareTo(two) == -1) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
