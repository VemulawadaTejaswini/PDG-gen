import java.io.IOException;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);

		double r = sc.nextDouble();
		double p = Math.PI;

		String x = String.format("%.8f",(Math.pow(r, 2)*p));
		String y = String.format("%.8f",((2*r)*p));

		System.out.println(x + " " + y);

		sc.close();
	}
}
