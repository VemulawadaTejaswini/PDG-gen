import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		try(Scanner sc = new Scanner(System.in)) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			Set<Integer> set = new HashSet<>();
			set.add(a);
			set.add(b);
			set.add(c);
			System.out.println(set.size() == 2 ? "Yes" : "No");
		}

	}

}
