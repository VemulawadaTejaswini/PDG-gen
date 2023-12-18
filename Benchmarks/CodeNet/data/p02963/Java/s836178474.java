import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long s = in.nextLong();
		long limit = (long) Math.pow(10, 9);
		final long x2 = limit;
		final long y2 = 1;
		long x3 = limit - s % limit;
		long y3 = s / limit + 1;
		
		System.out.println("0 0 " + limit + " 1 "  + x3 + " " + y3 );

		in.close();
	}
}
