import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		sc.nextLine();

		Set<Integer> dict = new HashSet<>(n);

		for (int i = 0; i < n; i++) {
			String in = sc.nextLine();
			doMethod(in, dict, n);
		}
	}

	private static void doMethod(String in, Set<Integer> dict, int n) {

		String[] param = in.split(" ");
		Integer hash = param[1].hashCode();

		if(param[0].equals("insert")) {
			dict.add(hash);

		} else {
			if(dict.contains(hash)) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
	}
}