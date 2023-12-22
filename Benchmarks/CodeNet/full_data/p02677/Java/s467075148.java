

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hLong = sc.nextInt();
		int mLong = sc.nextInt();
		int hour = sc.nextInt();
		int minute = sc.nextInt();
		int mAngle = 6 * minute;
		double hAngle = 30 * hour +   0.5 * minute;
		double angleDiff = Math.abs(hAngle - mAngle);
		double result = 0;

			double aSq = Math.pow(hLong, 2) + Math.pow(mLong, 2) - 2 * hLong * mLong * Math.cos(Math.toRadians(angleDiff));
			result = Math.sqrt(aSq);

		System.out.println(result);

	}

}
