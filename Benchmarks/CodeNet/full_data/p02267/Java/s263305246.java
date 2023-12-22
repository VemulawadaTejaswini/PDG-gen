import java.util.ArrayList;
import java.util.Scanner;

//ALDS1_4_A
public class Main {
	void run() {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] S = new int[n];
		for (int i = 0; i < n; i++) {
			S[i] = sc.nextInt();
		}
		int q = sc.nextInt();
		for (int i = 0; i < q; i++) {
			int cmp = sc.nextInt();
			for (int k = 0; k < S.length; k++) {
				if (cmp == S[k]) {
					count++;
					break;
				}
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		new Main().run();
	}
}

