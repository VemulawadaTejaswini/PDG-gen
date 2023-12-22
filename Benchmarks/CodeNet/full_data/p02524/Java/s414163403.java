import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		int C = sc.nextInt();
		
		double cRadian = C* Math.PI / 180;
		
		double h = getHeight(b, cRadian);
		double S = getArea(a, h);
		double L = getDistanceAround(a, b, getLastSide(a, b, h, cRadian));
		
		System.out.println(S);
		System.out.println(L);
		System.out.println(h);
	}
	
	public static double getHeight(double b, double c){
		return b * Math.sin(c);
	}
	
	public static double getArea(double a, double h){
		return (a * h) / 2;
	}
	
	private static double getLastSide(double a, double b, double h, double c){
		return Math.sqrt((h * h) + (a - b * Math.cos(c)) * (a - b * Math.cos(c)));
	}
	
	public static double getDistanceAround(double a, double b, double d){
		return a + b + d;
	}
}