import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Main main = new Main();
		main.solveD();
	}

	private void solveD() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] t = new int[N];
		int sum_t = 0;
		for (int i = 0; i < N; i++) {
			t[i] = sc.nextInt() * 2;
			sum_t += t[i];
		}
		int[] v = new int[N];
		for (int i = 0; i < N; i++) {
			v[i] = sc.nextInt() * 2;
		}
		int tmp_v = 0;
		int tmp_t = 0;
		int[] max_v = new int[sum_t + 1];
		for (int i = 0; i < N; i++) {
			max_v[tmp_t] = v[i] < tmp_v ? v[i] : tmp_v;
			tmp_v = max_v[tmp_t];
			for (int t_ind = 0; t_ind < t[i]; t_ind++) {
				max_v[++tmp_t] = v[i] < tmp_v + 1 ? v[i] : tmp_v + 1;
				tmp_v = max_v[tmp_t];
			}
		}
		tmp_v = 0;
		for (int i = N - 1; i >= 0; i--) {
			max_v[tmp_t] = v[i] < tmp_v ? v[i] : tmp_v;
			tmp_v = max_v[tmp_t];
			for (int t_ind = 0; t_ind < t[i]; t_ind++) {
				int back_v = v[i] < tmp_v + 1 ? v[i] : tmp_v + 1;
				--tmp_t;
				max_v[tmp_t] = max_v[tmp_t] < back_v ? max_v[tmp_t] : back_v;
				tmp_v = max_v[tmp_t];
			}
		}
		double answer = 0;
		for (int i = 0; i < sum_t; i++) {
			answer += (max_v[i] + max_v[i + 1]);
		}
		System.out.println(answer * 0.125);
	}
}