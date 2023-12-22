import java.util.Scanner;
public class Main{

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		int a,b =0;
		double h,g;


			a = sc.nextInt();
			b = sc.nextInt();

			int d = a / b;
			int r = a % b;
			h = a;
			g = b;
			double f = h / g;
			System.out.println(d+" " + r + " " + String.format("%.5f", f));
	}
}
