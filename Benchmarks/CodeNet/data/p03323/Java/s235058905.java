

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if (a < 9 && b < 9) {
			System.out.println("Yay!");
		} else {
			System.out.println(":(");
		}
		
		System.out.println("入力する台数を入力して下さい");
		int n = sc.nextInt();
		String[] name = new String[n];
		int[] num = new int[n];
		double[] gas = new double[n];
		Car[] car = new Car[n];

		

	}
}
