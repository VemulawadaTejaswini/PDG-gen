import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		
		double S = r * r * Math.PI;
		double L = 2.0 * r * Math.PI;
		
		System.out.println(S+" "+L);
	}
}