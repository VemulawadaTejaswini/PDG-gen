import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = in.nextInt();
		}
		int ans = 0;
		char sign = '0';
		for (int i = 0; i < N - 1; i++) {
			char tmp = A[i + 1] - A[i] > 0 ? '+' : A[i + 1] - A[i] == 0 ? '0' : '-';
			if (tmp == '0' || sign == '0') {
				sign = tmp != '0' ? tmp : sign;
			} else if (tmp != sign) {
				ans++;
				sign = '0';
			}
		}
		ans++;
		System.out.println(ans);
		in.close();
	}
}