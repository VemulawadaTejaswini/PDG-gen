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
			int ans = 0;
			if (Rb + dist <= Ra) {
				ans = 2;
			} else if (Ra + dist <= Rb) {
				ans = -2;
			} else if (Ra + Rb > dist) {
				ans = 1;
			}
			System.out.println(ans);
		}
		input.close();
	}
}