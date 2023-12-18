package arc085;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		try (
			Scanner scanner = new Scanner(System.in);
		) {
			int n;
			int m;
			BigDecimal x;
			
			n = Integer.parseInt(scanner.next());
			m = Integer.parseInt(scanner.next());
			
			int a = m * 1900 + (n - m) * 100;
			int b = (int)Math.pow(2, m);
			
			System.out.println(a * b);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
