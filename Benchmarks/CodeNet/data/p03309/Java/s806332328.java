import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int positiveNum = 0;
		int negativeNum = 0;

		long sadness = 0;

		int n = sc.nextInt();
		int x[] = new int[n];
		for (int i = 0; i < n; i++) {
			int input = sc.nextInt();
			x[i] = input - (i + 1);

			if (x[i] > 0) {
				positiveNum++;
				sadness += x[i];
			} else {
				negativeNum++;
				sadness -= x[i];
			}
		}

		Arrays.sort(x);

		long minSadness = sadness;

		long copySadness = sadness;
		long CopyPositiveNum = positiveNum;
		long CopyNegativeNum = negativeNum;

		int b = 1;
		while (true) {
			sadness -= positiveNum;
			sadness += negativeNum;

			int num = 0;
			int idx = Arrays.binarySearch(x, b);
			if (idx > 0 && idx < x.length) {
				int copyIdx = idx - 1;
				while (idx < x.length) {
					if (x[idx] == b) {
						num++;
					} else {
						break;
					}
					idx++;
				}
				while (copyIdx >= 0) {
					if (x[copyIdx] == b) {
						num++;
					} else {
						break;
					}
					copyIdx--;
				}
			}
			positiveNum -= num;
			negativeNum += num;

			if (sadness < minSadness) {
				minSadness = sadness;
			} else {
				break;
			}
			b++;
		}

		b = -1;
		int numOf0 = 0;
		int idxOf0 = Arrays.binarySearch(x, 0);
		if (idxOf0 > 0 && idxOf0 < x.length) {
			int copyIdx = idxOf0 - 1;
			while (idxOf0 < x.length) {
				if (x[idxOf0] == 0) {
					numOf0++;
				} else {
					break;
				}
				idxOf0++;
			}
			while (copyIdx >= 0) {
				if (x[copyIdx] == 0) {
					numOf0++;
				} else {
					break;
				}
				copyIdx--;
			}
		}
		CopyPositiveNum += numOf0;
		CopyNegativeNum -= numOf0;
		while (true) {
			copySadness += CopyPositiveNum;
			copySadness -= CopyNegativeNum;

			int num = 0;
			int idx = Arrays.binarySearch(x, b);
			if (idx > 0 && idx < x.length) {
				int copyIdx = idx - 1;
				while (idx < x.length) {
					if (x[idx] == b) {
						num++;
					} else {
						break;
					}
					idx++;
				}
				while (copyIdx >= 0) {
					if (x[copyIdx] == b) {
						num++;
					} else {
						break;
					}
					copyIdx--;
				}
			}
			CopyPositiveNum += num;
			CopyNegativeNum -= num;
			if (copySadness < minSadness) {
				minSadness = copySadness;
			} else {
				break;
			}
			b--;
		}

		System.out.println(minSadness);
	}

}
