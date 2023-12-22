import java.util.Scanner;

public class Main {

	public static int gcd(int x, int y) {
		if (y == 0) { 
			return x + y; }
		else {
			return gcd(y, x % y); } 			
	}
		
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int x = scnr.nextInt();
		int y = scnr.nextInt();
		System.out.println(gcd(x, y));
	}
}

