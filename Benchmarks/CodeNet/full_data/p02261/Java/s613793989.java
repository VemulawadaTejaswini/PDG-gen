import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int N = stdIn.nextInt();
		String[] tramps = new String[N];
		int[] trampsNumber = new int[N];

		for (int i = 0; i < N; i++) {
			tramps[i] = stdIn.next();
			trampsNumber[i] = tramps[i].charAt(1);
		}

		String[] sectionSort = tramps;
		String[] bubbleSort = tramps;

		int[] sectionSortNumber = trampsNumber;
		int[] bubbleSortNumber = trampsNumber;

		/*?????????????????¬???*/
		for (int i = 0; i < N; i++) {
			int min = sectionSortNumber[i];
			int minIndex = i;

			/*??´?????????????????????????????§????°????????????????*/
			for (int j = i + 1; j < N; j++) {
				if (min > sectionSortNumber[j]) {
					min = sectionSortNumber[j];
					minIndex = j;
				}
			}

			/*??\???????????????????????????????????????*/
			if (minIndex != i) {
				/*??´????????????????????????????????¨????°?????????´????????\????????????*/
				int tmpNumber = sectionSortNumber[i];
				String tmp = sectionSort[i];

				sectionSortNumber[i] = sectionSortNumber[minIndex];
				sectionSort[i] = sectionSort[minIndex];

				sectionSortNumber[minIndex] = tmpNumber;
				sectionSort[minIndex] = tmp;
			}
		}

		/*????????????????????¬???*/
		for (int i = 0; i < N; i++) {
			for (int j = N - 1; j > i; j--) {
				if (bubbleSortNumber[j] <= bubbleSortNumber[j - 1]) {
					String tmp = bubbleSort[j - 1];
					int tmpNumber = bubbleSortNumber[j - 1];

					bubbleSort[j - 1] = bubbleSort[j];
					bubbleSortNumber[j - 1] = bubbleSortNumber[j];

					bubbleSort[j] = tmp;
					bubbleSortNumber[j] = tmpNumber;
				}
			}
		}
		/*????????????*/
		for (int i = 0; i < N - 1; i++) {
			System.out.print(bubbleSort[i] + " ");
		}
		System.out.println(bubbleSort[N - 1]);
		System.out.println("Stable");

		for (int i = 0; i < N - 1; i++) {
			System.out.print(sectionSort[i] + " ");
		}
		System.out.println(sectionSort[N - 1]);

		int stableFlag = 1;
		for (int i = 0; i < N; i++) {
			if (!sectionSort[i].equals(bubbleSort[i])) {
				stableFlag = 0;
				break;
			}

		}

		if (stableFlag == 1) {
			System.out.println("Stable");
		}else{
			System.out.println("Not stable");
		}

	}
}