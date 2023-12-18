import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static boolean hiekou = false;
	public static int intHiekou = 0;

	public static void main(String[] args) {
		// 標準入力
		Scanner sc = new Scanner(System.in);

		String line1 = sc.nextLine();
		List<String> lines1 = Arrays.asList(line1.split(" "));
		Integer N = Integer.parseInt(lines1.get(0));
		Integer M = Integer.parseInt(lines1.get(1));

		if (N + M >= 24) {
			System.out.println(N + M - 24);
		} else {
			System.out.println(N + M);
		}
	}

}