import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		Set<Integer> s = createPowSet();
		for (int i = X; i >= 0; i--) {
			if (s.contains(i)) {
				System.out.println(i);
				return;
			}
		}
		System.out.println(1);
	}

	private static Set<Integer> createPowSet() {
		Set<Integer> s = new HashSet<>();
		for (int i = 2; i <= 1000; i++) {
			for (int j = 2; j <= 1000; j++) {
				int num = (int)Math.pow(i, j);
				if (num > 1000) {
					if (j == 2) {
						return s;
					} else {
						break;
					}
				}
				s.add(num);
			}
		}
		return s;
	}
}