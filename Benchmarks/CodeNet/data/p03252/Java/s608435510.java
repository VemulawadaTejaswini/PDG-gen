import java.util.Scanner;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] start = scanner.nextLine().split("");
		String[] goal = scanner.nextLine().split("");

		if(start.equals(goal)) {
			System.out.println("Yes");
			return;
		}

		HashMap<String, String> sgMap = new HashMap<>();
		HashMap<String, String> gsMap = new HashMap<>();
		for(int i = 0; i < start.length; i++) {
			String pre = null;
			if((pre = sgMap.put(start[i], goal[i])) != null && !pre.equals(goal[i])) {
				System.out.println("No");
				return;
			}
			if((pre = gsMap.put(goal[i], start[i])) != null && !pre.equals(start[i])) {
				System.out.println("No");
				return;
			}
		}

		System.out.println("Yes");
	}
}
