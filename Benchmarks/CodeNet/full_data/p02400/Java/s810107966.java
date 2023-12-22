import java.util.Scanner;

public class Cord {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a =sc.nextDouble();
		System.out.printf("%.6f %.6f\n",a*a*Math.PI,2*a*Math.PI);
	}
}

