import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double x = sc.nextDouble();

		double tri = (a * a * b) / 2; 
		double degree = 0;

		if(x > tri){
			degree = Math.toDegrees(Math.atan((2*b)/a-(2 * x)/(a*a*a)));
			//a*a*h/2 = a*a*b - X
			//h = 2b - 2X/a*a
			//a * tan d = h
			//h = a * tan d
			//a * tan d = 
			//1 * tand = 2b/a - 2X/a*a*a
			//d = arctan((2b*a*a-2X)/a*a*a)
		}
		else{
			degree = 90 - Math.toDegrees(Math.atan((2*x)/(b*b*b)));
			//tan d*b*b/2 = x
			//tan d = 2x / b^2
			//d = arctan (2x/b^2)
		}
		System.out.println(degree);
	}
}