import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		HashSet<Integer> accepted = new HashSet<>();

		int penalty = 0;

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		for (int i = 0; i < m; i++) {
			int problem = sc.nextInt();
			String result = sc.next();
			if (!accepted.contains(problem)) {
				// まだ正解していない
				if (result.equals("AC")) {
					accepted.add(problem);
				} else {
					penalty++;
				}
			}
		}
		print(accepted.size() + " " + penalty);
		sc.close();
	}

	public static void print(Object obj) {
		System.out.println(obj);
	}

}