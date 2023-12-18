import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		double left = Math.sqrt(scan.nextLong()) + Math.sqrt(scan.nextLong()), c = Math.sqrt(scan.nextLong());
		
		if(left < c ) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
	
}