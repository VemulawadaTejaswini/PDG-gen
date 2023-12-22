import java.util.Scanner;

public class Main {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		long a = in.nextLong();
		long b = in.nextLong();
		System.out.println((a * b) + " " + (a * 2 + b * 2));
	}

}