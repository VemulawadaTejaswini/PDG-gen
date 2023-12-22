import java.util.Scanner;
import java.util.Arrays;

class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		double s = String.format("%.5f", a * b * Math.sin(Math.toRadians(c)) / 2);
		double l = String.format("%.5f", a + b + Math.sqrt(a*a + b*b - 2*a*b*Math.cos(Math.toRadians(c))));
		double h = b * Math.sin(Math.toRadians(c))
		
		System.out.println(s + " " + l + " " + h);
	}
}