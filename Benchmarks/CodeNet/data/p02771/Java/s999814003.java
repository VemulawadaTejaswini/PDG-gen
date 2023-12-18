import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			HashSet<Integer> set = new HashSet<>();
			set.add(sc.nextInt());
			set.add(sc.nextInt());
			set.add(sc.nextInt());
			if (set.size() == 2) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}

}
