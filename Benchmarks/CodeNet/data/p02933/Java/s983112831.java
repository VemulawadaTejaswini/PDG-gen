import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {

			long a = sc.nextInt();
			String s = sc.next();
			
			if ( a >= 3200 ) {
				System.out.println(s);
			}
			else {
				System.out.println("red");
			}
		}
	}
}
