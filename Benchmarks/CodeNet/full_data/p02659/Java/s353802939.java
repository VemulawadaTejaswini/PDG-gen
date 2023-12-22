
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		a *= b;
		long result =  (long) Math.floor(a);
		System.out.println(result);
	}

}
