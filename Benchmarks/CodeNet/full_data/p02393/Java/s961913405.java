

import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int[] num = {a, b, c};

		Arrays.sort(num);
		System.out.print(num[0]);
		System.out.print(" ");
		System.out.print(num[1]);
		System.out.print(" ");
		System.out.print(num[2]);

	}
}