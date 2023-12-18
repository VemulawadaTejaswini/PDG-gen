import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// nがあり、nの数だけの整数の入力
			long n = sc.nextLong();
			List<Long> an = new ArrayList<>();
			for (long i = 0; i < n; i++) {
				an.add(sc.nextLong());
			}
			long retain = 0;
			long target = 1;
			for (int i = 0; i < an.size(); i++) {
				if (an.get(i) == target) {
					retain++;
					target++;
				}
			}
			if (target == 1) {
				System.out.println(-1);
			} else {
				System.out.println(an.size() - retain);
			}
		}
	}
}
