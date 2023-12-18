import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		 float dim = (n   / 3f);

		System.out.println( dim);
	
		double res = dim * dim * dim;

		float r=(int) res;
		
		
		String strDouble = String.format("%.12f", r);
		System.out.println(strDouble); // print 2.00

	}
}
