import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		while (n-- != 0) {
			double Xa = input.nextDouble();
			double Ya = input.nextDouble();
			double Ra = input.nextDouble();
			double Xb = input.nextDouble();
			double Yb = input.nextDouble();
			double Rb = input.nextDouble();
			double dist = Math.sqrt(Math.pow(Xa-Xb,2) + Math.pow(Ya-Yb,2));
			if (Rb + dist <= Ra) {
				System.out.println(2);
			} else if (Ra + dist <= Rb) {
				System.out.println(-2);
			} else if (Ra + Rb > dist) {
				System.out.println(1);
			} else {
				System.out.println(0);
			}
		}
		input.close();
	}
}