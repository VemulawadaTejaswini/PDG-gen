import java.util.Scanner;


public class Main {
		public static void main (String args[]) throws Exception{
		Scanner scan = new Scanner(System.in);
		long a = scan.nextLong();
		double b = scan.nextDouble();
		// seisuu
		long ans =  a * (long)(b * 100);
		System.out.println(ans / 100);
	}
}