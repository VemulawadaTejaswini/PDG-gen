import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		scn.nextLine();
		char[] str = scn.nextLine().toCharArray();
		int N = str.length;
		int[] e_num = new int[N];
		int num = 0;
		for (int i = 0; i < N; i++) {
			if (str[i] == 'E') {
				num++;
			}
			e_num[i] = num;
		}

		int ans = 0;
		for (int i = 0; i < N; i++) {
			if (i == 0) {
				ans = e_num[N-1] - e_num[i];
			} else {
				ans = Math.min(ans, e_num[N - 1] - e_num[i] + i - e_num[i - 1]);
			}
		}
		System.out.println(ans);
	}

}
