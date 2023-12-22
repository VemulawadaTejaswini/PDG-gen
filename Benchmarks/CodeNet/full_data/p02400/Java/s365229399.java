
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double r = s.nextDouble();
		double pi = Math.PI;
		
		System.out.printf("%.5f %.5f",r*r*pi,2*r*pi);
				
	}

}