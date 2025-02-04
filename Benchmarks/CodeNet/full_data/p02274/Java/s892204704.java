import java.util.Scanner;

class Main {
	// ???????????????????????§???????????????????????°????????????????????°
	private static int count = 0;
	//????????????????´?????????§???+1????????????????????°
	private static int max = -1;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//??\????????????????????????????´????????????????????´?????????°???????????????????????????????????§???+ 1????±???????
		int n = scanner.nextInt();
		int[] numList = new int[n];
		for (int i = 0; i < n; i++) {
			numList[i] = scanner.nextInt();
			if (max < numList[i]) {
				max = numList[i] + 1;
			}
		}
		scanner.close();
		// ?????????????????????????????? ?????°???????±???????(numList)????????????????°????????´???????(0)?????????????????§???????´???????(n)?????????
		mergeSort(numList, 0, n);
		/*System.out.print(numList[0]);
		for (int i = 1; i < n; i++) {
			System.out.print(" " + numList[i]);
		}
		System.out.println();*/
		System.out.println(count -1);
	}

	// ???????????????(mid)???????????????L??¨R????????????????´?????????? L??¨R????????????????´???°???????????¨?????????
	// L??¨R??????????´?????????????????°????????????????numList???????´???????????????£??????????´?+1?????§????????§??????????????????????????????????´?????????§???
	// +1(max)????????????????????????????´?????????????
	static void merge(int[] numList, int left, int mid, int right) {
		int n1 = mid - left;
		int n2 = right - mid;
		int[] L = new int[n1 + 1];
		int[] R = new int[n2 + 1];

		for (int i = 0; i < n1; i++) {
			L[i] = numList[left + i];
		}

		for (int i = 0; i < n2; i++) {
			R[i] = numList[mid + i];
		}

		L[n1] = max;
		R[n2] = max;
		int i = 0;
		int j = 0;
		// L??¨R??????????????????????°????????????????numList???????´??????????
		// ?°?????????????????????????????????????????¬??????????????????????????????????????´????????????????????????°?????????+1?????????
		for (int k = left; k < right; k++) {
			if (L[i] <= R[j]) {
				numList[k] = L[i];
				i = i + 1;
			} else {
				count++;
				numList[k] = R[j];
				j = j + 1;
			}
		}
	}

	// ????¨????merge???????????????????±??????????????°?????´???????(left)??¨?????§????´???????(right)?????????-1??????????????§??°????????????
	static void mergeSort(int[] numList, int left, int right) {
		if ((left + 1) < right) {
			int mid = (left + right) / 2;

			mergeSort(numList, left, mid);
			// System.out.println("???");
			mergeSort(numList, mid, right);
			// System.out.println("???");
			merge(numList, left, mid, right);
		}
	}
}