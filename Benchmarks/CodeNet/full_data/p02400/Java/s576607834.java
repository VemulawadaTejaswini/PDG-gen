import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double r = sc.nextDouble();
		double p = 3.141592653589;
		double ca = r * r * p;
		double cm = r * 2 * p;
		
		System.out.printf("%.7f",ca + " " + "%.7f",cm);
		sc.close();
	}

}