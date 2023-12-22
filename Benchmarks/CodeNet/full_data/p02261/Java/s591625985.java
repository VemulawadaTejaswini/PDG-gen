import java.util.Arrays;
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);

	void run() {
		int N = sc.nextInt();
		String[] in1 = new String[N];
		String[] in2 = new String[N];
		for (int i = 0; i < N; i++) {
			String s = sc.next();
			in1[i] = s;
			in2[i] = s;
		}

		// BubbleSort
		for (int i = 1; i < N; i++) {
			for (int j = N - 1; j >= i; j--) {
				if (in1[j].charAt(1) < in1[j - 1].charAt(1)) {
					String tmp = in1[j];
					in1[j] = in1[j - 1];
					in1[j - 1] = tmp;
				}
			}
		}

		// SelectionSort
		for (int i = 0; i < N; i++) {
			int min = i;
			for (int j = i + 1; j < N; j++) {
				if (in2[min].charAt(1) > in2[j].charAt(1)) {
					min = j;
				}
			}
			String tmp = in2[i];
			in2[i] = in2[min];
			in2[min] = tmp;
		}

		print(in1);
		System.out.println("Stable");
		print(in2);
		System.out.println(match(in1, in2) ? "Stable" : "Not stable");
	}

	void print(String[] s) {
		for (int i = 0; i < s.length; i++) {
			System.out.print((i == 0 ? "" : " ") + s[i]);
		}
		System.out.println();
	}

	boolean match(String[] s1, String[] s2) {
		for (int i = 0; i < s1.length; i++) {
			if (!s1[i].equals(s2[i])) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		new Main().run();
	}
}