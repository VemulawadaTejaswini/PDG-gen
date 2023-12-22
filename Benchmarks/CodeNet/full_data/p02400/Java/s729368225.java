import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double r =  new Scanner(System.in).nextDouble();		
		double cir = 2 * Math.PI * r;
		double vol = Math.PI * Math.pow(r, 2);
		System.out.printf("%.6f %.6f", vol, cir);
	}
}