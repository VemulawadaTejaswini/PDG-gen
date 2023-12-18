import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int S = in.nextInt();
		final int W = in.nextInt();
		System.out.println((W > S) ? "usafe" : "safe");
	}
}