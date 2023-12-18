import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] num = new int[N];
		for (int i = 0; i < N; i++) {
			num[i] = in.nextInt() - 1;
		}
		int ans = 0;
		for (int i = 0; i < N; i++) {
			if (num[i] == i && (i == 0 || (i > 0 && num[i - 1] != i - 1))) {
				ans++;
			}
		}
		System.out.println(ans);
		in.close();
	}
}