import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double R1 = sc.nextDouble();
		double R2 = sc.nextDouble();
		double d1 = (double)1 / R1;
		double d2 = (double)1/ R2;
		double d3 = 1 / (d1 + d2);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
	}
}