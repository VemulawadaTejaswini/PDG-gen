import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public  static int merge(int[] afterA, int left, int mid, int right) {
		int n1 = mid - left;
		int n2 = right - mid;

		int[] lMatrix = new int[n1 + 1];
		int[] rMatrix = new int[n2 + 1];

		for(int i = 0; i < n1; i++) {
			lMatrix[i] = afterA[left + i];
		}

		for(int i = 0; i < n2; i++) {
			rMatrix[i] = afterA[mid + i];
		}

		lMatrix[n1] = 1000000001;
		rMatrix[n2] = 1000000001;

		int i = 0;
		int j = 0;
		int count = 0;
		for(int k = left; k < right; k++) {
			if (lMatrix[i] <= rMatrix[j]) {
				afterA[k] = lMatrix[i];
				i = i + 1;
				count++;
			} else {
				afterA[k] = rMatrix[j];
				j = j + 1;
				count++;
			}
		}
		return count;
	}

	public static int mergeSort(int[] afterA, int left, int right) {
		int countSum = 0;
		int countMergeSortLeft = 0;
		int countMergeSortRight = 0;
		if (left + 1 < right) {
			int mid = (left + right) / 2;

			countMergeSortLeft = mergeSort(afterA, left, mid);
			countMergeSortRight = mergeSort(afterA, mid, right);
			countSum = merge(afterA, left, mid, right);
		}
		return countSum + countMergeSortLeft + countMergeSortRight;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		String[] targetMatrix = br.readLine().split(" ");

		int[] targetMatrixInt = new int[n];

		for(int i = 0; i < n; i++) {
			targetMatrixInt[i] = Integer.parseInt(targetMatrix[i]);
		}

		int targetMatrixMid = 0;

		int countResult = mergeSort(targetMatrixInt, targetMatrixMid, n);

		StringBuilder sb = new StringBuilder();

		for(int i = 0; i < targetMatrixInt.length; i++) {
			sb.append(targetMatrixInt[i]);
			sb.append(" ");

			if(i == targetMatrixInt.length - 1) {
				System.out.println(sb.toString());
				System.out.println(countResult);
			}
		}
	}
}