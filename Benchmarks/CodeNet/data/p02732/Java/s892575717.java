import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int[][] ball = new int[n][2];
		List<Integer> a = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(sc.next());
			ball[i][0] = num;
			ball[num - 1][1]++;
		}
		int defans = 0;
		for (int i = 0; i < n; i++) {
			defans += ball[i][1] * (ball[i][1] - 1) / 2;
		}
		defans++;
		for (int i = 0; i < n; i++) {
			System.out.println(defans - ball[ball[i][0] - 1][1]);
		}
	}
}