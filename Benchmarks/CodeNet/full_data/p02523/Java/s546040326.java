import java.util.Scanner;
import java.lang.Math;

class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		double x1, y1, x2, y2;
		
		x1 = scan.nextDouble();
		y1 = scan.nextDouble();
		x2 = scan.nextDouble();
		y2 = scan.nextDouble();
		
		double x = x1 - x2;
		double y = y1 - y2;
		
		x = Math.abs(x);
		y = Math.abs(y);
		
		double ans = Math.sqrt(x * x + y * y);
		
		System.out.println(ans);
		
	}
}