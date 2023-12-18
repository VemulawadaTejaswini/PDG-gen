import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			
			String S = scan.next();
			System.out.println(S.equals("ABC")?"ARC":"ABC");
			
		}
		
		
	}
		

}
