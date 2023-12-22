import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		long a = scn.nextLong();
		double b = scn.nextDouble() * 100;
		long c = (long) ((long)a * b) / 100;
		System.out.println(c);
		
		
	}
}