package _200;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long power = 1;

		for(int i = 1; i <= N; i++) {
			power *= i;
		}
		System.out.println(power % (1000000000 +7));
	}
}
