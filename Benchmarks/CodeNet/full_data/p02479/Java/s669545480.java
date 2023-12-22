import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double pi = Math.PI;
		double r = sc.nextDouble();
		double s = pi * r * r;
		double l = 2 * pi * r;
		System.out.printf("%f %f",s,l);
	}
}