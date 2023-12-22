import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double C = sc.nextDouble();

		double S = 0.5*a*b*Math.sin(Math.PI*C/180.0);
		double c = Math.sqrt(a*a+b*b-2*a*b*Math.cos(Math.PI*C/180.0));

		System.out.printf("%.10f\n",S);
		System.out.printf("%.10f\n",a+b+c);
		System.out.printf("%.10f\n",2*S/a);
	}

}

