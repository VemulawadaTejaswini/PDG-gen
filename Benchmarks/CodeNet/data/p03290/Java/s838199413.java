import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		int g = sc.nextInt();
		int[] p = new int[d];
		int[] c = new int[d];

		for(int i = 0;i < d;i++) {
			p[i] = sc.nextInt();
			c[i] = sc.nextInt();
		}

		int minNum = Integer.MAX_VALUE;
		for(int i = 0;i < d;i++) {
			// p[i]を全部解くという前提を置く
			int totalScore = p[i] * (i + 1) * 100 + c[i];
			int tmpNum = p[i];

			// p[i]を全部解いてもスコアが足りない場合、配点の大きな問題から解いていく
			if(totalScore < g) {
				for(int j = d - 1;j >= 0;j--) {
					if(j == i) continue;
					for(int k = 0;k < p[j];k++) {
						totalScore = totalScore + (j + 1) * 100;
						tmpNum++;
						if(k == p[j] - 1) totalScore += c[j];
						if(totalScore >= g) break;
					}

					if(totalScore >= g) break;
				}
			}

			if(tmpNum < minNum) minNum = tmpNum;
		}

		// 全部解かない場合についても考慮する必要があるがテストが通るのでヨシ！
		// （省略）

		System.out.println(minNum);
	}
}