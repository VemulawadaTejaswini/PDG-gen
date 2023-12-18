import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		double left = Math.sqrt(scan.nextDouble()) + Math.sqrt(scan.nextDouble()), c = Math.sqrt(scan.nextDouble());
		
		if(left < c ) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
	
}
