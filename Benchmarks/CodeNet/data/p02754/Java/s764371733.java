import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		long n = scan.nextLong();
		long a = scan.nextLong();
		long b = scan.nextLong();
		
		long x = n/(a+b);
		
		long y = x*a;
		
		if (n % (a+b) != 0) {
			y++;
		}
		
		System.out.println(y);
	}

}