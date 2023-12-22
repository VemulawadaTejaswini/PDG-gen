import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double n = sc.nextDouble();
		double count = b;
		if(n < b) {
			count = n;
		}
		double max = 0;
		for(double x =1;x <=count;x++) {
			double f = Math.floor(a * x/b) -(a * Math.floor(x/b));
			if(f > max) {
				max = f;
			}
		}
		System.out.println((int)max);
	}
}