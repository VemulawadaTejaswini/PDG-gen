import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * 計算式は 距離= sqrt( (x1-x2)^2 + (y1-y2)^2 )
		 */

		double distance = DistanceCalculation(sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());

		System.out.println(distance);

	}

	static double DistanceCalculation(double x1, double y1, double x2, double y2) {
		double distance = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
		return distance;
	}

}

