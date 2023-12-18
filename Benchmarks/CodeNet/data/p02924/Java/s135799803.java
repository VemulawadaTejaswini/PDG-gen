import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long N = in.nextLong();
		System.out.println(N * (N - 1) / 2);
		in.close();
	}
}