import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double n = sc.nextDouble();
		double sum = 0;
		if (a % b ==0) {
			System.out.println(0);
			return;
		}
		if (n < b) {
			sum = calc(a,b,n);
			System.out.println((long)sum);
			return;
		} else if (n == b) {
			sum = calc(a,b,n-1);
			System.out.println((long)sum);
			return;
		} else {
			ArrayList<Double> list = new ArrayList<>();
			long size = (long)(n + 1)/ (long) b;
			for (int i = 1; i <= size; i++) {
				list.add(calc(a,b,i*b-1));
			}
			System.out.println(Collections.max(list).longValue());
		}
	}

	private static double calc(double a, double b, double n) {
		return Math.floor(a*n/b) - a*Math.floor(n/b);
	}

}
