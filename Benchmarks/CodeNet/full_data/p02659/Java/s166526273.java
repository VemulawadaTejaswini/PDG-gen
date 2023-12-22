import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		long a = scn.nextLong();
		double b = scn.nextDouble();
		long p = (long) (b * 100);
		System.out.println(a*p/100);
		/* 144444445884645447 1.5 */
	}
}