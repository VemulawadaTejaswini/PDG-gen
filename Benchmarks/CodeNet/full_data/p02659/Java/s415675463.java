import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		long a = s.nextLong();
		long b = (long)(s.nextDouble() * 100);
		
		long mul = (long)(a * b);
		

		System.out.println(mul/100);

	}

}
