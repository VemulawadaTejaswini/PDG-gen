import java.util.Scanner;

public class Main {
	public static void main(String args[]){

		Scanner scan= new Scanner(System.in);
		int r = scan.nextInt();
		double S = r*r*Math.PI;
		double L = r*2*Math.PI;
		System.out.printf("%lf.6 %lf.6"S,L);
	}
}