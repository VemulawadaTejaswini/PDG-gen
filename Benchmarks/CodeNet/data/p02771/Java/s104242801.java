
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < 3; i++) {
			set.add(sc.nextInt());
		}
		if (set.size() == 2) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}


