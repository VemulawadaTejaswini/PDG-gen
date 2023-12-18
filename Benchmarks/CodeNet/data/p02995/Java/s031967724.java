

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		scan.close();
		
		int numC = b/c - a/c;
		int numD = b/d - a/d;
		int numCD = b/(c*d) - a/(c*d);
		
		//System.out.println(numC + " " + numD + " " + numCD);
		System.out.println(b - a - numC - numD + numCD);
		
	}

}
