import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			double A = scan.nextDouble();
			double B = scan.nextDouble();
			double H= scan.nextDouble();
			double M = scan.nextDouble();
			
			double a = 0;
			double b = 0;
			
			if(30*H>180)a = 360-30*H;
			else a = 30*H;
			
			if(6*M>180)b = 360-6*M;
			else b = 6*M;
			
					
			
			
			double ra = Math.toRadians(a);
			double rb = Math.toRadians(b);
			
			double ab = Math.sqrt(A*A+B*B-2*A*B*Math.cos(rb-ra));
			
			
			System.out.println(ab);
		
			
			
			
			
		}
	}
		

}
