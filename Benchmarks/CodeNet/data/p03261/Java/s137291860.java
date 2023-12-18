import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		String[] w = new String[N];
		Set<String> ws = new HashSet<>();
		for (int i = 0; i < N; i++) {
			w[i] = sc.next();
			ws.add(w[i]);
		}
		if (ws.size() != N) {
			System.out.println("No");
			return;
		}
		for (int i = 0; i < w.length - 1 ; i++) {
			if (w[i+1].charAt(0) != w[i].charAt(w[i].length() -1)) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}
}