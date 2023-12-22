import java.util.Scanner;

class Main {
	public static void main(String args[]){

		Scanner scan= new Scanner(System.in);
		int r = scan.nextInt();
		double S = r*r*Math.PI;
		double L = r*2*Math.PI;
		System.out.printf("%f %f",S,L);
	}
}