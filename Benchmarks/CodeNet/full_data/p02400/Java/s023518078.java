import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double r = sc.nextInt();

		double area = r * r * Math.PI;
		double cl = 2 * r * Math.PI;

		String area1 = String.format("%.7f", area);
		String cl2 = String.format("%.7f", cl);
		sc.close();

		System.out.println(area1 + " " + cl2);
	}

}