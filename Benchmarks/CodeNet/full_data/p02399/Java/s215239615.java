import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int a, b, d, r;
		double f;
		
		Scanner scan = new Scanner(System.in);
		
		a = scan.nextInt();
		b = scan.nextInt();
		
		d = a / b;
		r = a % b;
		f = (double)a / (double)b;
		
		System.out.printf("%d ", d);
		System.out.printf("%d ", r);
		System.out.printf("%f", f);
		
	}

}
