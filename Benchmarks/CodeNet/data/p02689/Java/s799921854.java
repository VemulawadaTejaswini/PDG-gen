import java.util.Scanner;
public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int towerCount = sc.nextInt();
		int roadCount = sc.nextInt();

		int[] towerHeight = new int[towerCount];
		for (int i = 0; i < towerCount; i++) {
			towerHeight[i] = sc.nextInt();
		}

		boolean[] towerJudge = new boolean[towerCount];
		for (int i = 0; i < towerCount; i++) {
			towerJudge[i] = true;
		}

		int[] towerA = new int[roadCount];
		int[] towerB = new int[roadCount];
		for (int i = 0; i < roadCount; i++) {
				towerA[i] = sc.nextInt();
				towerB[i] = sc.nextInt();

				towerA[i]--;
				towerB[i]--;

				if(towerHeight[towerA[i]] <= towerHeight[towerB[i]]) {
					towerJudge[towerA[i]] = false;
				}

				if(towerHeight[towerB[i]] <= towerHeight[towerA[i]]) {
					towerJudge[towerB[i]] = false;
				}
		}

		int goodTowerCount = 0;


		for (int i = 0; i < towerCount; i++) {
			if (towerJudge[i]) {
				goodTowerCount++;
			}
		}

		System.out.print(goodTowerCount);

	return;

	}
}
