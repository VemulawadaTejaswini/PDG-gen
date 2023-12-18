import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		String[] S = new String[N];
		String s = scn.next();
		S = s.split("");

		// 同じ文字列の数操作
		HashMap<Integer, Integer> map = new HashMap<>();
		int count = 0;
		ArrayList<String> list = new ArrayList<>();
		for (int i = 0; i < N;i++) {
			String point = S[i];
			if (!(list.contains(point))) {
			for (int j = 0; j < N; j++) {
				if (i == j) {
					continue;
				}
				if (S[j].equals(point)) {
					list.add(point);
					count++;
				}
			}
			}
		}
		for (int i = 0; i < N -2; i++) {
			map.put((i+2), (count-i));
		}

		System.out.println(Main.kaizyou(4));
		// 計算
		int ans = 0;
		for (int i = 1; i <= N; i++) {
			ans += ((Main.kaizyou(N)) / ((Main.kaizyou(i))*((Main.kaizyou(N-i)))))/* % 1000000007*/;
		}
		//System.out.println((ans += ((Main.kaizyou(4)) / ((Main.kaizyou(2))*((Main.kaizyou(4-2)))))/* % 1000000007*/));
	}
	static int kaizyou(int n) {
		if (n == 1) {
			return 1;
		}
		return n * kaizyou(n-1);
	}
}
