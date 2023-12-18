
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		long x = in.nextLong();
		long y = in.nextLong();

		System.out.println((int)(Math.log10(y/x) / Math.log10(2)) + 1);
	}

}
