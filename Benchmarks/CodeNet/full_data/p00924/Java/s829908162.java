import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);

	void run() {
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] bit = new int[n];
		int[] len = new int[m];
		for (int i = 0; i < n; i++) {
			bit[i] = sc.nextInt();
		}
		for (int i = 0; i < m; i++) {
			len[i] = sc.nextInt();
		}
		int[] goal1 = new int[n];
		int[] goal2 = new int[n];
		boolean turn = false;
		int index = 0;
		for (int i = 0; i < m; i++) {
			turn = !turn;
			for (int j = 0; j < len[i]; j++) {
				goal1[index] = turn ? 1 : 0;
				goal2[index++] = turn ? 0 : 1;
			}
		}
		// debug(goal1);
		// debug(goal2);

		int[] p1 = new int[n];
		int[] p2 = new int[n];
		for (int i = 0; i < n; i++) {
			p1[i] = bit[i];
			p2[i] = bit[i];
		}
		// debug(p1);
		// debug(p2);
		int cnt1 = 0;
		for (int i = 0; i < n; i++) {
			if (p1[i] != goal1[i]) {
				int s = i;
				int t = -1;
				for (int j = i; j < n; j++) {
					if (p1[i] != p1[j]) {
						t = j;
					}
				}
				if (t != -1) {
					int tmp = p1[s];
					p1[s] = p1[t];
					p1[t] = tmp;
					cnt1 += t - s;
				}
			}
		}

		boolean able1 = true;
		for (int i = 0; i < n; i++) {
			if (p1[i] != goal1[i]) {
				able1 = false;
			}
		}
		int cnt2 = 0;
		for (int i = 0; i < n; i++) {
			if (p2[i] != goal2[i]) {
				int s = i;
				int t = -1;
				for (int j = i; j < n; j++) {
					if (p2[i] != p2[j]) {
						t = j;
						break;
					}
				}
				if (t != -1) {
					int tmp = p2[s];
					p2[s] = p2[t];
					p2[t] = tmp;
					cnt2 += t - s;
				}
			}
		}
		boolean able2 = true;
		for (int i = 0; i < n; i++) {
			if (p2[i] != goal2[i]) {
				able2 = false;
			}
		}
		int one = 0;
		int zero = 0;
		int one1 = 0;
		int zero1 = 0;
		int one2 = 0;
		int zero2 = 0;
		for (int i = 0; i < n; i++) {
			if (bit[i] == 0) {
				zero++;
			} else {
				one++;
			}
			if (goal1[i] == 0) {
				zero1++;
			} else {
				one1++;
			}
			if (goal2[i] == 0) {
				zero2++;
			} else {
				one2++;
			}
		}
		if(zero != zero1 || one != one1) {
			able1 = false;
		}
		if(zero != zero2 || one != one2) {
			able2 = false;
		}
		if (!able1 && !able2) {
			System.out.println(0);
		} else {
			if (!able1 && able2) {
				System.out.println(cnt2);
			} else if (able1 && !able2) {
				System.out.println(cnt1);
			} else {
				System.out.println(Math.min(cnt1, cnt2));
			}
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}
}