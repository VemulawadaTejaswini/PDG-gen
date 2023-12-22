import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		Scanner stdIn = new Scanner(System.in);
		int x = stdIn.nextInt();
		
		while( x < 1 || x > 100) {
			x = stdIn.nextInt();
		}
		
		System.out.println( x * x * x);
		
	}
}
