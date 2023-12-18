import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		execute7_2();
	}

	private static void execute7_2() {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();

			Set<Float> s = new HashSet<>();
			boolean d = false;

			for (int i = 0; i < N; i++) {
				float a = sc.nextFloat();

				if (!d && !s.contains(a)) {
					s.add(a);
				} else {
					d = true;
				}
			}
			
			if(!d) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}

		}
	}
}