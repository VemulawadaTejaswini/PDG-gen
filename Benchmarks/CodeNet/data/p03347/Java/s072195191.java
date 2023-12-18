import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();

		List<Long> alist = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			alist.add(scanner.nextLong());
		}

		if (alist.get(0) != 0) {
			System.out.println("-1");
			return;
		}

		long count = 0;

		for(int i = N-1; i > 0; i--) {
			if (alist.get(i) == alist.get(i-1) + 1) { // 1, 2
				count = count + 1;
			} else if (alist.get(i) == alist.get(i-1)) { // 1, 1
				count = count + alist.get(i+1) ;
			} else if (alist.get(i) == alist.get(i-1) - 1) { // 3, 2
				count = count + alist.get(i+1);
			} else if (alist.get(i) - alist.get(i-1) > 1) { // 1, 3
				System.out.println("-1");
				return;
			}
		}
		System.out.println(count);
	}
}