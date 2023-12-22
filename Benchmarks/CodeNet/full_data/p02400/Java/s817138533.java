import java.io.IOException;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);

		double r = sc.nextDouble();
		double p = Math.PI;

		System.out.println((r*r)*p + " " + (2*r)*p);

		sc.close();
	}
}
