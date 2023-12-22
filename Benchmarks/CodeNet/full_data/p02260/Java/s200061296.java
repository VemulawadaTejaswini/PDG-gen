import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] strs = br.readLine().split(" ");
		int[] inputData = new int[n];
		for (int i = 0; i < n; i++) {
			inputData[i] = Integer.parseInt(strs[i]);
		}
		printArray(inputData, selectionSort(inputData));
	}

	public static int selectionSort(int[] A) {
		int swapCnt = 0;
		for (int i = 0; i < A.length; i++) {
			int minIdx = i;
			for (int j = i; j < A.length; j++) {
				if (A[minIdx] > A[j]) {
					minIdx = j;
				}
			}
			if (i == minIdx) continue;
			int temp = A[i];
			A[i] = A[minIdx];
			A[minIdx] = temp;
			swapCnt++;
		}
		return swapCnt;
	}

	public static void printArray(int[] target, int swapCnt) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < target.length; i++) {
			sb.append(target[i]);
			if (i < target.length - 1) {
				sb.append(" ");
			}
		}
		sb.append("\n");
		sb.append(swapCnt);
		System.out.println(sb.toString());
	}
}