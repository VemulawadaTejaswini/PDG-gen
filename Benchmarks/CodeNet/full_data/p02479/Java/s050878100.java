import java.util.Scanner;


public class Main{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		double  a = sc.nextInt();
		double pi = Math.PI;
		double length = 2 * pi * a;
		double area = a * a * pi;
		System.out.println(String.format("%.6f",length) + " " + String.format("%.6f",area));
	}
}