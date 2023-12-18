
import java.util.ArrayList;
import java.util.Scanner;

// internous_atcoder_001 at 2018/02/15

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.solveB044();
	}

	private void solveA080() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		if (N * A < B) {
			System.out.println(N * A);
		} else {
			System.out.println(B);
		}
	}

	private void solveA044() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();
		if (N <= K) {
			System.out.println(N * X);
		} else {
			System.out.println((K * X) + (N - K) * Y);
		}
	}

	private void solveB044() {
		Scanner sc = new Scanner(System.in);
		char w[] = sc.nextLine().toCharArray();
		ArrayList<Character> used = new ArrayList<>();
		for (char c : w) {
			if (!used.contains(c)) {
				if (!cnt(w, c)) {
					System.out.println("No");
					return;
				} else {
					used.add(c);
				}
			}
		}
		System.out.println("Yes");
	}
	private boolean cnt(char[] w, char t) {
		int count = 0;
		for (char c : w) {
			if (c == t) {
				count++;
			}
		}
		if (count % 2 == 1) {
			return false;
		}
		return true;
	}

	private void solveD() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(N);
	}

	private void solveE() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(N);
	}

	private void solveF() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(N);
	}

}