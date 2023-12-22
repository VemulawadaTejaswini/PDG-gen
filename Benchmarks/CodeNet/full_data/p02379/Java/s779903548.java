import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double x1,x2,y1,y2;

		x1 = sc.nextDouble();
		y1 = sc.nextDouble();
		x2 = sc.nextDouble();
		y2 = sc.nextDouble();

		double kyori =Math.pow(Math.abs(x1 - x2),2) + Math.pow(Math.abs(y1 - y2),2);

		System.out.print(Math.sqrt(kyori));

		sc.close();

	}

}
