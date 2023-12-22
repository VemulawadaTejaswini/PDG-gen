import java.util.Scanner;
import java.lang.Math;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		double r = sc.nextDouble();
		double pi = Math.PI;
		double s = r * r * pi;
		double l = 2 * r * pi;		

		System.out.printf("%9.6f %9.6f\n", s, l);
	}
}