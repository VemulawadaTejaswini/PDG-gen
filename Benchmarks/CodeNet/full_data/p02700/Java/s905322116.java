import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int A = in.nextInt();
		final int B = in.nextInt();
		final int C = in.nextInt();
		final int D = in.nextInt();
		final double T = (double) C / B;
		final double O = (double) A  / D;
		System.out.println((Math.ceil(T) <= Math.ceil(O)) ? "Yes" : "No");
	}
}