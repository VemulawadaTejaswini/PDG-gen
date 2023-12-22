import java.util.*;
class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		float a = in.nextFloat(), b = in.nextFloat();
		System.out.printf("%d %d %.6f\n", (int)a/(int)b, (int)a%(int)b, a/b);
	}
}