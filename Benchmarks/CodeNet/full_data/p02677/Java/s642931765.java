
import java.util.Scanner;

public class Main  {

	public static  void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		double a, b, h, m;
	        a = sc.nextDouble();
	        b = sc.nextDouble();
	        h = sc.nextDouble();
	        m = sc.nextDouble();
	        
	        double a2 = 30 * h + m * 0.5;
	        double b2 = 6 * m;
	        
	        double c2 = Math.min(Math.abs(a2 - b2) , Math.abs(360 - (a2 - b2)));
	        double pi = c2 / 180 * Math.PI;
	        double tou = Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(pi));
	        System.out.println(tou);
	
	}

}