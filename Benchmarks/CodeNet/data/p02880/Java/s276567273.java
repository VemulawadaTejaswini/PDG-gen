import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {

			int n = sc.nextInt();
			
			for(int i = 1 ; i < 10 ; i++ ) {
				for(int j = 1 ; j < 10 ; j++ ) {
					if ( n == i*j) {
						System.out.println("Yes");
						return;
					}
				}
			}
			
			System.out.println("No");
			
			
		}
	}
}