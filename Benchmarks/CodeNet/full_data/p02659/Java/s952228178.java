import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long a = scn.nextLong();
		double n = scn.nextDouble();
		long m = (long) Math.floor(a * n);
		System.out.println(m);
	}
}