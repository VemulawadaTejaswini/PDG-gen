// Main.java

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		final long X = sc.nextLong();
		final long Y = sc.nextLong();
		final int N = (int)(Math.log(Y/(double)X)/Math.log(2.0) + 1.0);
		System.out.println(N);
	}
}