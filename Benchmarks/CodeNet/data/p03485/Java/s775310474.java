import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double n = (a + b) / 2;
		int m = (int) Math.ceil(n);
		System.out.println(m);
	}

}
