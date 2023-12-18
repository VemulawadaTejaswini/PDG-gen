import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		Scanner in = new Scanner(System.in);

		int N = in.nextInt();

		int[] interbal = new int[N];
		int[] start = new int[N];
		int[] second = new int[N];
		int[] ans = new int[N];

		for(int i=0; i<N-1; i++) {
			interbal[i] = in.nextInt();
			start[i] = in.nextInt();
			second[i] = in.nextInt();
			ans[i] = 0;
		}

		ans[N-1] = 0;

		for(int i=0; i<N-1; i++) {
			ans[i] = start[i] + interbal[i];
			for(int j=i + 1; j<N-1; j++) {
				int s = Math.max(ans[i], start[j]);
				if(s % second[j] > 0) {
					s = ((s / second[j]) + 1) * second[j];
				}
				ans[i] = s + interbal[j];
			}
		}

		for(int i : ans) {
			System.out.println(i);
		}
	}

}
