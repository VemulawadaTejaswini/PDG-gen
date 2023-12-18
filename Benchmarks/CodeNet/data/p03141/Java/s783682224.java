import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		// 標準入力
		Scanner scanner = new Scanner(System.in);
		String inputN = scanner.nextLine();

		int n = Integer.parseInt(inputN);
		ArrayList<Integer> scoreT = new ArrayList<>(); // 高橋
		ArrayList<Integer> scoreA = new ArrayList<>(); // 青木
		ArrayList<Integer> scoreDiff = new ArrayList<>();  // 評価の差

		long resultT = 0;
		long resultA = 0;

		for (int i=0; i<n; i++) {
			String input = scanner.nextLine();
			String[] inputAry = input.split(" ");
			scoreT.add(Integer.parseInt(inputAry[0]));
			scoreA.add(Integer.parseInt(inputAry[1]));
			scoreDiff.add(scoreT.get(i) - scoreA.get(i));
		}

		for (int j=0; j<n; j++) {
			if (j%2 == 0) {
				// 高橋のターン
				int index = getMaxDiffIndex(scoreDiff);
				if (index < 0) {
					index = getMaxIndex(scoreT);
					resultT += scoreT.get(index);
				} else {
					resultT += scoreT.get(index);
				}
				scoreT.remove(index);
				scoreA.remove(index);
			} else {
				// 青木のターン
				int index = getMaxDiffIndex(scoreDiff);
				if (index < 0) {
					index = getMaxIndex(scoreA);
					resultA += scoreA.get(index);
				} else {
					resultA += scoreA.get(index);
				}
				scoreT.remove(index);
				scoreA.remove(index);
			}
		}

		System.out.println(resultT - resultA);
	}

	private static int getMaxIndex(ArrayList<Integer> arr) {
		int max = arr.get(0);
		int index = 0;
		for (int i = 1; i < arr.size(); i++) {
		    int v = arr.get(i);
		    if (v > max) {
		        max = v;
		        index = i;
		    }
		}

		return index;
	}

	private static int getMaxDiffIndex(ArrayList<Integer> arr) {
		int max = arr.get(0);
		int index = 0;
		int count = 0;
		for (int i = 1; i < arr.size(); i++) {
		    int v = arr.get(i);
		    if (v == max) count++;
		    if (v > max) {
		        max = v;
		        index = i;
		    }
		}

		if (count == arr.size() - 1) return -1;

		return index;
	}
}
