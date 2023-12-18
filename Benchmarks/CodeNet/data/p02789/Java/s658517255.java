import java.util.Scanner;
public class Main {
	public static void main (String args[]) {
		Scanner lector= new Scanner (System.in);
		System.out.println("Digite N");
		double N=lector.nextDouble();
		System.out.println ("Digite M");
		double M=lector.nextDouble();
		if (N==M) {
			System.out.println ("Yes");
		}
		else {
			System.out.println ("No");
		}
	}
}
