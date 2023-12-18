import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		scanner.close();
		Set<Integer> set = new HashSet<>();
		for (int i = 1; i <= 9; i++) {
			for (int j = i; i <= 9; j++) {
				set.add(i * j);
			}
		}
		if (set.contains(A)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
        }
	}
}