import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		ArrayList<Integer> small = new ArrayList();
		int answer = 1;

		for (int i = 0; i < N; i++) {
			int A = scan.nextInt();
			small.add(A);
		}

		Collections.sort(small);
		answer = gcd(small.get(0), small.get(1));

		if (small.size() > 2) {
			for (int i = 2; i < small.size(); i++) {
				answer = gcd(small.get(i), answer);
			}
		}
		System.out.println(answer);
	}

	public static int gcd(int A, int B) {
		int ans = 1;
		while ((ans = A % B) != 0) {
			A = B;
			B = ans;
		}
		if (ans == 0) {
			ans = B;
		}

		return ans;
	}
}