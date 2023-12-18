import java.util.Scanner;

public class Main {
	int f(int lAnimal, int cAnimal, char cAnswer) {
		if (cAnswer == 'o') {
			if (cAnimal == 0) {
				return (lAnimal + 1) % 2;
			} else {
				return lAnimal;
			}
		} else {
			if (cAnimal == 0) {
				return lAnimal;
			} else {
				return (lAnimal + 1) % 2;
			}
		}
	}

	void g(int[] ret) {
		int n = ret.length;
		for (int i = 0; i < n; i++) {
			if (ret[i] == 0) {
				System.out.print('W');
			} else {
				System.out.print('S');
			}
		}
		System.out.println();
	}

	boolean h(int n, char[] s, int a0, int a1) {
		int[] ret = new int[n];
		ret[0] = a0;
		ret[1] = a1;
		for (int i = 2; i < n; i++) {
			ret[i] = f(ret[i - 2], ret[i - 1], s[i - 1]);
		}
		if (f(ret[n - 2], ret[n - 1], s[n - 1]) == ret[0]) {
			g(ret);
			return true;
		}
		return false;
	}

	void run() {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		char[] s = sc.next().toCharArray();
		if (h(n, s, 1, 1)) return;
		if (h(n, s, 1, 0)) return;
		if (h(n, s, 0, 1)) return;
		if (h(n, s, 0, 0)) return;
		System.out.println(-1);
}

	public static void main(String[] args) {
		new Main().run();
	}
}
