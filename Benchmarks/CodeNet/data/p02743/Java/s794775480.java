import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		double left = Math.sqrt(scan.nextInt()) + Math.sqrt(scan.nextInt()), c = Math.sqrt(scan.nextInt());
		
		if(left < c ) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
	
}