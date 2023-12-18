import java.util.*;

class Main {
	Scanner sc;

	void calc() {
		sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		if (N%2 != 0) {
			System.out.println("No");
			return;
		}
		int h = S.length()/2;
		for (int i = 0; i < h; i++) {
			if (S.charAt(i) != S.charAt(i+h)) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}

	public static void main(String[] args) {
		new Main().calc();
	}
}