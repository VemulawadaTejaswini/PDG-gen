package common;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		double R;
		double area;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("半径 ");
		R = scanner.nextDouble();
		
		area = R * 3.14 * 2;
		
		System.out.println("周長 " + area);
	}
