import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {
			
			double h = sc.nextLong();
			double n = sc.nextInt();
			
			for(int i = 0 ; i < n ; i++ )  {
				h -= sc.nextLong();
				if ( h <= 0 ) {
					System.out.println("Yes");
					return;
				}
			}
			System.out.println("No");			
		}
	}
}