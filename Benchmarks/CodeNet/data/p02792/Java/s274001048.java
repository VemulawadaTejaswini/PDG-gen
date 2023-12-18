import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();

		int[][] map = new int[10][10];
		for (int i = 1; i <= N; i++) { // Aの探索
			String s = String.valueOf(i);
			int f = Integer.parseInt(s.substring(0, 1));
			int l = Integer.parseInt(s.substring(s.length() - 1));
			map[f][l]++; // 先頭と末尾の桁を記録
		}

		long ans = 0;
		for (int i = 1; i <= N; i++) { // Bの探索
			String s = String.valueOf(i);
			int revF = Integer.parseInt(s.substring(s.length() - 1));
			int revL = Integer.parseInt(s.substring(0, 1));
			ans += map[revF][revL]; // 一致するものを数える
		}

		System.out.println(ans);
	}
}
