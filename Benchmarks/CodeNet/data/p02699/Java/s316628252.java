import java.util.*;

public class a {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int S = scan.nextInt();
		int W = scan.nextInt();
		scan.close();

		System.out.println(S <= W ? "unsafe" : "safe");
	}
}