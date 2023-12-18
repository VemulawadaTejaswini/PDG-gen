import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		String a = stdIn.next();
		String b = stdIn.next();
		
		if (a.charAt(0) == 'H' && b.charAt(0) == 'H') { 
			System.out.println("H");
		} else if (a.charAt(0) == 'D' && b.charAt(0) == 'H') {
			System.out.println("D");
		} else if (a.charAt(0) == 'D' && b.charAt(0) == 'D') {
			System.out.println("H");
		} else {
			System.out.println("D");
		}
	}
}