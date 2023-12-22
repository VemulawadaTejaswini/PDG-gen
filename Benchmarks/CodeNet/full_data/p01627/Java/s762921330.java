import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();
		int T = sc.nextInt();
		int[][] time = new int[N][2];
		String[][] name = new String[N][2];
		for (int i = 0; i < N; ++i) {
			time[i][0] = time(sc.next());
			name[i][0] = sc.next();
			time[i][1] = time(sc.next());
			name[i][1] = sc.next();
		}
		ArrayList<Integer> res = new ArrayList<Integer>();
		for (int i = 0; i < N - 1; ++i) {
			if (time[i + 1][0] - time[i][1] >= T) res.add(i);
		}
		System.out.println(res.size());
		for (int i : res) {
			System.out.println(name[i][1] + " " + (time[i + 1][0] - time[i][1]));
		}
	}

	static int time(String hhmm) {
		int h = (hhmm.charAt(0) - '0') * 10 + hhmm.charAt(1) - '0';
		int m = (hhmm.charAt(3) - '0') * 10 + hhmm.charAt(4) - '0';
		return h * 60 + m;
	}

}