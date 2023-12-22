import java.util.Scanner;

class Main {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		int flag = 0;
		int[] numList = new int[count];

		for (int i = 0; i < count; i++) {
			numList[i] = scanner.nextInt();
		}
		Tool.shellSort(numList, count, flag);

		for (int i = 0; i < count; i++) {
			System.out.println(numList[i]);
		}
	}
}

class Tool {

	static int inssertionSort(int[] numList, int count, int distance, int flag) {

		for (int i = distance; i < count; i++) {
			int temp = numList[i];
			int j = i - distance;
			while (j >= 0 && numList[j] > temp) {
				numList[j + distance] = numList[j];
				j = j - distance;
				flag++;
			}
			numList[j + distance] = temp;
		}
		return flag;
	}

	static void shellSort(int[] numList, int count, int flag) {

		int m = 0;
		int[] distanceList = new int[15];
		for (int i = 1; i < count; i = i * 3 + 1) {
			for (int j = m; j > 0; j--) {
				distanceList[j] = distanceList[j - 1];
			}
			distanceList[0] = i;
			m++;
		}
		if (m == 0) {
			distanceList[0] = 1;
			m = 1;
		}

		for (int i = 0; i < distanceList.length; i++) {
			flag =	inssertionSort(numList, count, distanceList[i], flag);
		}
		System.out.println(m);
		System.out.print(distanceList[0]);
		for (int i = 1; i < distanceList.length; i++) {
			if (distanceList[i] == 0) {
				break;
			}
			System.out.print(" " + distanceList[i]);
		}
		System.out.println("\n" + flag);
	}
}