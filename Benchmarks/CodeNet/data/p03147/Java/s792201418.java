
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		new Main().exec();
	}

	void exec() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int h[] = new int[n];
		for (int i = 0; i < n; i++) {
			h[i] = sc.nextInt();
		}

		int act = 0;
		int result = 0;

		for (int i = 0; i < n; i++) {
			if (act > h[i]) {
				act = h[i];
			}else {
				result += h[i] - act;
				act = h[i];
			}
		}

		System.out.println(result);
		sc.close();
	}
}
