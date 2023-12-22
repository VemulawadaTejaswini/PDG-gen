/*
 * http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ALDS1_5_D&lang=jp
 */
import java.util.*;


public class Main {
	
	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] A = new int[n];
		for (int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
		}
		int count = 0;
		for (int i = 0; i < A.length-1; i++) {
			for (int j = i + 1; j < A.length; j++) {
				if (A[i] > A[j]) count++;
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		new Main().run();
	}

}

