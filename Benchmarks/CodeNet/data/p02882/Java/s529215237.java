import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		double a = in.nextDouble();
		double b = in.nextDouble();
		double x = in.nextDouble();
		System.out.println(solve(a, b, x));
		in.close();
	}

	private static double solve(double a, double b, double x) {
		x /= a;
		if (a * b / 2 > x) {
			double aa = x / b * 2;
			return Math.atan(b / aa) / Math.PI * 180;
		} else {
			x = a * b - x;
			double bb = x / a * 2;
			return Math.atan(bb / a) / Math.PI * 180;
		}
	}
}