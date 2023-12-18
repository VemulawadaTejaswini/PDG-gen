import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {

			double n = sc.nextDouble();

			double p = (n /2) / n;
			if ( n % 2 == 0 ) {
				p = 1f/2f;
			}
			else {
				p =( Math.floor(n/2) + 1) / n;
			}
			
			System.out.println(p);
						
			
		}
	}
}
