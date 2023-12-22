import java.util.Scanner;
import java.util.Random;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();
		scanner.close();

		System.out.println(gcd(n1, n2));
		// System.out.println(n1 + " " + n2);
	}

	public static int gcd(int num1, int num2) {
		if (num1 == num2)
			return num1;

		if (num1 > num2)
			return gcd(num1 - num2, num2);
		return gcd(num1, num2 - num1);
	}
}
