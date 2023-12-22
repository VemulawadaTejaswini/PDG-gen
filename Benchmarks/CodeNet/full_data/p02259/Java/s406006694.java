public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] strs = br.readLine().split(" ");
		int[] inputData = new int[n];
		for (int i = 0; i < n; i++) {
			inputData[i] = Integer.parseInt(strs[i]);
		}
		printArray(inputData, bubbleSort(inputData, n));
	}

	public static int bubbleSort(int[] A, int N) {
		int swapCnt = 0;
		int flag = 1;
		while (flag == 1) {
			flag = 0;
			for (int i = N - 1; i > 0; i--) {
				if (A[i] < A[i - 1] ) {
					int temp = A[i];
					A[i] = A[i - 1];
					A[i - 1] = temp;
					swapCnt++;
					flag = 1;
				}
			}
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