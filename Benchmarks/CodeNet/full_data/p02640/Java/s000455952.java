import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {

			int x = sc.nextInt();
			int y = sc.nextInt();

			if ( y % 2 == 0 && x * 2 <= y && y <= x * 4 ) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
		}
	}

}