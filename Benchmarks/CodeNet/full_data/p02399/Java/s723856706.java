import java.util.Scanner;
import java.math.*;

public class Main{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();

		int d = a / b;
		int r = a & b;
		float f = (float)a / (float)b;

		System.out.print(d + " " + r);
		System.out.println("%.5f\n", f);
	}
}