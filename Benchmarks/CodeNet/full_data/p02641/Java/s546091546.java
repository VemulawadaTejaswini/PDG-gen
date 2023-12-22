import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int n = sc.nextInt();
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < n; i++) {
			set.add(sc.nextInt());
		}

		int bigger = x;
		int smaller = x;
		while (true) {
			boolean hasBigger = set.contains(bigger);
			boolean hasSmaller = set.contains(smaller);
			
			if (hasBigger && hasSmaller) {
				smaller--;
				bigger++;
			} else {
				if (hasSmaller) {
					System.out.println(bigger);
				} else {
					System.out.println(smaller);
				}
				break;
			}
		}
	}
}
