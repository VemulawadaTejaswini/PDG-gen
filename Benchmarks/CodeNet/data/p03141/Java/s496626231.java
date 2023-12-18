import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		// 標準入力
		Scanner scanner = new Scanner(System.in);
		String inputN = scanner.nextLine();

		int n = Integer.parseInt(inputN);
		int scoreT[] = new int[n]; // 高橋
		int scoreA[] = new int[n]; // 青木
		int scoreDiff[] = new int[n];  // 評価の差

		long resultT = 0;
		long resultA = 0;

		for (int i=0; i<n; i++) {
			String input = scanner.nextLine();
			String[] inputAry = input.split(" ");
			scoreT[i] = Integer.parseInt(inputAry[0]);
			scoreA[i] = Integer.parseInt(inputAry[1]);
			scoreDiff[i] = scoreT[i] - scoreA[i];
		}

		for (int j=0; j<n; j++) {
			if (j%2 == 0) {
				// 高橋のターン
				int index = getMaxDiffIndex(scoreDiff);
				if (index < 0) {
					index = getMaxIndex(scoreT);
					resultT += scoreT[index];
					scoreT[index] = 0;
					scoreA[index] = 0;
				} else {
					resultT += scoreT[index];
					scoreT[index] = 0;
					scoreA[index] = 0;
				}
			} else {
				// 青木のターン
				int index = getMaxDiffIndex(scoreDiff);
				if (index < 0) {
					index = getMaxIndex(scoreA);
					resultA += scoreA[index];
					scoreT[index] = 0;
					scoreA[index] = 0;
				} else {
					resultA += scoreA[index];
					scoreT[index] = 0;
					scoreA[index] = 0;
				}
			}
		}

		System.out.println(resultT - resultA);
	}

	private static int getMaxIndex(int[] arr) {
		int max = arr[0];
		int index = 0;
		for (int i = 1; i < arr.length; i++) {
		    int v = arr[i];
		    if (v > max) {
		        max = v;
		        index = i;
		    }
		}

		return index;
	}

	private static int getMaxDiffIndex(int[] arr) {
		int max = arr[0];
		int index = 0;
		int count = 0;
		for (int i = 1; i < arr.length; i++) {
		    int v = arr[i];
		    if (v == max) count++;
		    if (v > max) {
		        max = v;
		        index = i;
		    }
		}

		if (count == arr.length - 1) return -1;

		return index;
	}
}
