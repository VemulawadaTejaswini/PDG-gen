import java.util.*;

public class Main {
	public static void main() {
		Scanner scan = new Scanner(System.in);
		int S = scan.nextInt();
		int W = scan.nextInt();
		scan.close();

		System.out.println(S < W ? "unsafe" : "safe");
	}
}