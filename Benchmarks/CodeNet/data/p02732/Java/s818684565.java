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
			ball[num][1]++;
		}
		for (int i = 0; i < n; i++) {
			ball[ball[i][0]][1]--;
			int ans = 0;
			for (int j = 0; j < n; j++) {
				ans += ball[j][1] * (ball[j][1] - 1) / 2;
			}
			System.out.println(ans);
			ball[ball[i][0]][1]++;
		}
	}
}