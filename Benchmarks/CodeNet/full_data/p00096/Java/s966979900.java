import java.util.Scanner;

public class Main {
	long[] cache = new long[2001];
	long[] anss = new long[4001];
	Scanner sc = new Scanner(System.in);

	void init() {
		for (int i = 0; i < 1001; i++) {
			for (int j = 0; j < 1001; j++) {
				cache[i + j]++;
			}
		}

		for (int i = 0; i < 2001; i++) {
			for (int j = 0; j < 2001; j++) {
				anss[i + j] += cache[i] * cache[j];
			}
		}

	}

	void run() {
		init();
		while (sc.hasNext()) {
			int n = sc.nextInt();
			System.out.println(anss[n]);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

}