import java.util.Arrays;
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	int zero_cnt;
	int[] number;
	int[] pos;
	int[] set;
	int ans;

	void run() {
		for (;;) {
			number = new int[10];
			int[] check = new int[11];
			zero_cnt = 0;
			ans = 0;
			for (int i = 0; i < 10; i++) {
				number[i] = sc.nextInt();
				if (number[i] == -1) {
					return;
				}
				check[number[i]]++;
				if (number[i] == 0) {
					zero_cnt++;
				}
			}
			set = new int[zero_cnt];
			pos = new int[zero_cnt];
			int index = 0;
			int index2 = 0;
			for (int i = 1; i <= 10; i++) {
				if (check[i] == 0) {
					set[index++] = i;
				}
			}
			for (int i = 0; i < 9; i++) {
				if (number[i] == 0) {
					pos[index2++] = i;
				}
			}
			boolean[] use = new boolean[zero_cnt];
			solve(0, use);
			System.out.println(ans);
		}
	}

	void solve(int n, boolean[] use) {
		if (n == zero_cnt) {
			judge(number);
		} else {
			for (int i = 0; i < zero_cnt; i++) {
				if (use[i]) {
					continue;
				}
				number[pos[i]] = set[n];
				use[i] = true;
				solve(n + 1, use);
				use[i] = false;
			}
		}
	}

	void judge(int[] res) {
		if ((res[0] + res[1] + res[2]) % res[9] == 0
				&& (res[3] + res[4] + res[5]) % res[9] == 0
				&& (res[6] + res[7] + res[8]) % res[9] == 0
				&& (res[0] + res[3] + res[6]) % res[9] == 0
				&& (res[1] + res[4] + res[7]) % res[9] == 0
				&& (res[2] + res[5] + res[8]) % res[9] == 0
				&& (res[0] + res[4] + res[8]) % res[9] == 0
				&& (res[2] + res[4] + res[6]) % res[9] == 0) {
			ans++;
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}
}