import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		LinkedList<Integer> kamikire = new LinkedList<Integer>();

		for (int i = 0; i < N; i++) {
			Integer A = sc.nextInt();
			if (!kamikire.contains(A)) {
				kamikire.add(A);
			} else {
				kamikire.remove(A);
			}
		}
		System.out.print(kamikire.size());
	}
}
