import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// ??°?????????????????¨?????????????????????????????????????????????????´????????????????????????????????????????
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int n = scanner.nextInt();
		int count = 0;
		int[] list = new int[n];
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			list[i] = scanner.nextInt();
			// ????°?????????????????????????????????????????°?????????????
			if (list[i] < min) {
				min = list[i];
			}
		}
		int[] sortedList = (int[]) list.clone();
		// ???????????????????´???°???????????????????????????????????????????????????????????????????????????
		mergeSort(sortedList, 0, n);
		// ??????????????????????????¨?????????????´????????´??????????????????????
		for (int i = 0; i < n; i++) {
			map.put(sortedList[i], i);
		}
		boolean flag = true;
		int time = 1;
		// ????????¨
		do {
			if (min != list[0]) {
				flag = true;
				int tempIndex = 0;
				for (int i = 0; i < n; i++) {
					if (list[i] == min) {
						tempIndex = i;
					}
				}
				for (int j = 0; j < n; j++) {
					if (sortedList[tempIndex] == list[j]) {
						int temp = list[j];
						//System.out.println("\n" + temp + "??¨" + min + "?????????" + time + "??????");
						list[j] = min;
						list[tempIndex] = temp;
						count = count + list[j] + list[tempIndex];
						time++;
						break;
					}
				}
				for (int k = 0; k < n; k++) {
					if (k != map.get(list[k])) {
						flag = false;
					}
				}
/*				for (int i = 0; i < n; i++) {
					System.out.print(list[i]);
				}*/
			} else {
				flag = true;
				for (int i = 0; i < n; i++) {
					if (i != map.get(list[i])) {
						int temp = list[i];
						int ind = map.get(list[i]);
						int temp2 = list[ind];
						list[i] = temp2;
						list[ind] = temp;
						count = count + temp + temp2;
						//System.out.println(temp + "??¨" + temp2 + "?????????" + time + "??????");
						break;
					}
				}
				for (int k = 0; k < n; k++) {
					if (k != map.get(list[k])) {
						flag = false;
					}
				}
			}
		} while (flag != true);
		System.out.println(count);
	}

	// ????¨??????????????????????????????????
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

		L[n1] = Integer.MAX_VALUE;
		R[n2] = Integer.MAX_VALUE;
		int i = 0;
		int j = 0;
		// L??¨R??????????????????????°????????????????numList???????´??????????
		// ?°?????????????????????????????????????????¬??????????????????????????????????????´????????????????????????°?????????+1?????????
		for (int k = left; k < right; k++) {
			if (L[i] <= R[j]) {
				numList[k] = L[i];
				i = i + 1;
			} else {
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