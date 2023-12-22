import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		int first	= 0;
		int second	= 0;
		int third	= 0;
		
		if ( a < b ) {
			first	= a;
			second	= b;
			
			if (b < c ) {
				third = c;
				
			} else {
				third	= b;
				second	= c;
			}
		} else if ( b < a ) {
			first	= b;
			second	= a;
			
			if ( a < c ) {
				third	= c;
				
			} else {
				second	= c;
				third	= a;
			}
			
		}
		
		System.out.printf("%d %d %d", first, second,third);
		
	}
}