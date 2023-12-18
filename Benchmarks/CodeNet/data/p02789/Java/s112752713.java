import java.util.Scanner;
public class Main {
	public static void main (String args[]) {
		Scanner lector= new Scanner (System.in);
		double N=lector.nextDouble();
		double M=lector.nextDouble();
		if (N==M) {
			System.out.println ("Yes");
		}
		else {
			System.out.println ("No");
		}
	}
}
