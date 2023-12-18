package Test;

import java.io.InputStream;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int X, A;
		Scanner input = new Scanner(System.in);
		X = input.nextInt();
		A = input.nextInt();
		if (X < A) {
			System.out.print(0);
		} else {
			System.out.print(10);
		}
	}
}
