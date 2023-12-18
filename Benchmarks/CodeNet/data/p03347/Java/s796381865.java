import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();

		List<Long> alist = new ArrayList<>();
		List<Long> xlist = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			alist.add(scanner.nextLong());
		}

		if (alist.get(0) != 0) {
			System.out.println("-1");
			return;
		}

		long count = 0;

		for(int i = 0; i < N-1; i++) {
			if (alist.get(i+1) == alist.get(i) + 1) {
				count = count + 1;
			} else if (alist.get(i+1) == alist.get(i)) {
				count = count + alist.get(i+1) ;
			} else if (alist.get(i+1) == alist.get(i) - 1) {
				count = count + alist.get(i+1);
			} else if (alist.get(i+1) - alist.get(i) > 1) {
				System.out.println("-1");
				return;
			}
		}
		System.out.println(count);
	}

}