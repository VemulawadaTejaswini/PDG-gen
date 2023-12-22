import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		long xs[] = {in.nextLong(), in.nextLong(), in.nextLong()};
		Arrays.sort(xs);
		System.out.println(xs[0] + " " + xs[1] + " " + xs[2]);
	}

}