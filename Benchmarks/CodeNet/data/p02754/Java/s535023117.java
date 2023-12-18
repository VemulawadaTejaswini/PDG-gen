import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		long n = scan.nextLong();
		long a = scan.nextLong();
		long b = scan.nextLong();
		
		long x = (long) (n/(a+b));
		
		long y =(long) (x*a);
		
		y+= Math.min(n%a, a);
		
		System.out.println(y);
	}

}