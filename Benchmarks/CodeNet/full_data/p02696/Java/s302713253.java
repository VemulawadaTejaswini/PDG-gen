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

		System.out.println((int)(Math.floor(a * count/b) -(a * Math.floor(count/b))));
	}
}