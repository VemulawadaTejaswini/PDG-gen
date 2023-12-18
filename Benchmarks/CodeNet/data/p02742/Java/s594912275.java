import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long H = scn.nextLong();
		long W = scn.nextLong();
		long m = H * W;
		if (m % 2 == 0) {
			System.out.println((m / 2));
		} else {
			System.out.println((m / 2) + 1);
		}
	}
}