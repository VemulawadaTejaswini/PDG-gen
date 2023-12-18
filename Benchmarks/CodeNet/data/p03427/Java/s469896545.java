import java.util.Scanner;

public class Main {

	private static final long x = (long) Math.pow(10, 18);

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long iti = n % 10;
		
		System.out.println(n - iti - 1);

		sc.close();
	}

}
