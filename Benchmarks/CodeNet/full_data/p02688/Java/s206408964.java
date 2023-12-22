import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < k; i++) {
			int d = sc.nextInt();
			for (int j = 0; j < d; j++) {
				set.add(sc.nextInt());
			}
		}
		sc.close();

		System.out.println(n - set.size());
	}
}
