import java.util.Scanner;

public class Main {
	// 2-100
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		long a = in.nextLong();
		long b = in.nextLong();
		long c = in.nextLong();
		long d = in.nextLong();
		long firstA = a*c;
		long firstB = a*d;
		long SecondA = b*c;
		long SecondB = b*d;
		System.out.println(Math.max(Math.max(firstA, firstB),Math.max(SecondA, SecondB)));
	}

}