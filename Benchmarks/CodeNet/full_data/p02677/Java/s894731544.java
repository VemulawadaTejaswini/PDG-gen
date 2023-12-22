
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double A = scan.nextInt();
		double B = scan.nextInt();
		double H = scan.nextInt();
		double M = scan.nextInt();

		double hour = 2* Math.PI *((H * 60 + M) / (12 * 60));
		double min = 2* Math.PI *(M / 60);
		double theta = Math.abs(hour - min);
		
		double length = Math.sqrt(B*B + A*A - 2*A*B*Math.cos(theta));
		System.out.println(length);
		scan.close();
	}

}
