import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int a = 0;
		int b = 0;
		int d = 0;
		int r = 0;
		double f = 0.0;

		Scanner sc= new Scanner(System.in);
		
		a = sc.nextInt();
		b = sc.nextInt();

		d = a / b;
		r = a % b;
		f = (double)a / (double)b;
		
		System.out.println( d + " " + r + " " + f );
		sc.close();
	}
}
