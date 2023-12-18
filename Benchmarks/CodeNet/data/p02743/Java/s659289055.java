import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long a = sc.nextInt();
		long b = sc.nextInt();
		long c = sc.nextInt();
		sc.close();

		boolean ans = Math.sqrt(a * b) < (c - a - b) / 2;

		printBool(ans);
	}

	public static void print(Object obj) {
		System.out.println(obj);
	}

	public static void printBool(boolean bool) {
		print(bool ? "Yes" : "No");
	}

}