import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {
			
			long x = sc.nextLong();

			for(int a = 0 ; a < 400 ; a++ ) {
				for(int b = -400 ; b < 400 ; b++ ) {
					
					long diff = (long)(Math.pow(a, 5) - Math.pow(b, 5));
					
					if ( x == diff ) {
						System.out.println(a + " " + b);
						return;
					}
				}
			}
		}
	}

}