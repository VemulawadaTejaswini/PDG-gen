import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){



		try (Scanner scanner = new Scanner(System.in)) {

			int n = scanner.nextInt();
			int q = scanner.nextInt();

			int[] list = new int[n];
			for (int i = 0; i < n; i++) {
				list[i] = scanner.nextInt();
			}

			int start = 0;
			int end = 0;
			HashSet<Integer> hashset = new HashSet<Integer>();
			for (int i = 0; i < q; i++) {
				start = scanner.nextInt();
				end = scanner.nextInt();
				for (int j = start - 1; j < end; j++) {
					if (hashset.contains(list[j])) {
						hashset.add(list[j]);
					}
				}
				System.out.println(hashset.size());
				hashset.clear();
			}
		}
	}
}