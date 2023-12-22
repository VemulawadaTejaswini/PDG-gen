import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();

		ArrayList<Integer> aArr = new ArrayList();
		ArrayList<Integer> countLight;

		for (int i = 0; i < n; i++) {
			aArr.add(sc.nextInt());
		}

		while (k > 0) {
			countLight = new ArrayList();
			for (int i = 0; i < n; i++) {
				countLight.add(0);
			}
			for (int i = 1; i <= aArr.size(); i++) {
				// 電球の照らす範囲
				int lightD = i - aArr.get(i - 1);
				int lightU = i + aArr.get(i - 1);
				// 照らされている数を数える
				for (int j = lightD; j <= lightU; j++) {
					if (0 < j && j <= n) {
						countLight.set(j - 1, countLight.get(j - 1) + 1);
					}
				}
			}
			k--;
			aArr = new ArrayList();
			aArr.addAll(countLight);
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			sb.append(aArr.get(i));
			if (i < n - 1) {
				sb.append(" ");
			}
		}
		// 出力
		System.out.println(sb.toString());
	}
}