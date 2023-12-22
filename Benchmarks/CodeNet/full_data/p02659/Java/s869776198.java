

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		long a = s.nextLong();
		double b = s.nextDouble();
		
		long mul = (long)(a * b);
		
		s.close();

		System.out.println(mul);

		

	}

}
