import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	public static void main(final String[] args) {
		@SuppressWarnings("resource")
		final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		final int N = in.nextInt();
		final int K = in.nextInt();
		System.out.println(N - K + 1);
	}
}
