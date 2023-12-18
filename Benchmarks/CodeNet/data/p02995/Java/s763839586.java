import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long a = scan.nextLong()-1;
		long b = scan.nextLong();
		long c = scan.nextLong();
		long d = scan.nextLong();
		
		long x = a - (a / c) - (a / d) + (a / (c * d));
		long y = b - (b / c) - (b / d) + (b / (c * d));

		System.out.println(y-x);
		
		//12345 7910 
		//
	}
}