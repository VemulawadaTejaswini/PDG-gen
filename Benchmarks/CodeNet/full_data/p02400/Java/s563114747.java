import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double r = s.nextDouble();
		double pi = 3.14159265;
		
		System.out.printf("%.5f %.5f",r*pi*pi,2*r*pi);
				
	}

}