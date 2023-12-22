import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		
		for(int i = 1; i <= n; i++) {
			 if (i % 3 == 0 || Integer.toString(i).contains("3")) {
		            System.out.print(" " + i);
		        } 
		}
		System.out.println();
	}
}
