import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int n = sc.nextInt();
		Set<Integer> S = new HashSet<Integer>(n);
		for (int i = 0; i < n; i++) {
			S.add(sc.nextInt());
		}
		int q = sc.nextInt();
		for (int i = 0; i < q; i++) {
			if (S.contains(sc.nextInt()))
				count++;
		}
		System.out.println(count);
	}
}