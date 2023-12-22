import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void printArray(String[] cardSort) {
		for (int i = 0; i < cardSort.length; i++) {
			System.out.print(cardSort[i]);

			if (i == cardSort.length - 1) {
				break;
			}
			System.out.print(" ");
		}
		System.out.println();
	}

	public static boolean isStable(String in[], String out[]) {
		int N = in.length;
		for(int i = 0; i < N; i++) {
			for(int j = i + 1; j < N; j++) {
				for(int a = 0; a < N; a++) {
					for(int b = a + 1; b < N; b++) {
						if(in[i].charAt(1) == in[j].charAt(1) && in[i].equals(out[b]) && in[j].equals(out[a])) {
							return false;
						}
					}
				}
			}
		}
		return true;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int progCardNumOfSheets = Integer.parseInt(br.readLine());

		String[] card = br.readLine().split(" ");

		String[] cardNumBubbleSort = new String[progCardNumOfSheets];
		String[] cardNumSelectionSort = new String[progCardNumOfSheets];


		for(int i = 0; i < progCardNumOfSheets; i++) {
			cardNumBubbleSort[i] = card[i];
			cardNumSelectionSort[i] = card[i];
		}

		int compareNumResult = 0;
		String compareNum1 = "";
		String compareNum2 = "";

		boolean isSortFlag = true;

		while(isSortFlag) {
			isSortFlag = false;

			for(int i = progCardNumOfSheets - 1; i > 0; i-- ) {
				compareNum1 = cardNumBubbleSort[i].substring(1);
				compareNum2 = cardNumBubbleSort[i - 1].substring(1);
				compareNumResult = compareNum1.compareTo(compareNum2);
				if(compareNumResult < 0) {
					String tmp = cardNumBubbleSort[i - 1];
					cardNumBubbleSort[i - 1] = cardNumBubbleSort[i];
					cardNumBubbleSort[i] = tmp;
					isSortFlag = true;
				}
			}
		}

		printArray(cardNumBubbleSort);

		if(isStable(card, cardNumBubbleSort)) {
			System.out.println("Stable");
		} else {
			System.out.println("Not stable");
		}

		int minNum = 0;
		for(int i = 0; i < progCardNumOfSheets; i++) {
			minNum = i;

			for(int j = i; j < progCardNumOfSheets; j++) {
				compareNum1 = cardNumSelectionSort[j].substring(1);
				compareNum2 = cardNumSelectionSort[minNum].substring(1);
				compareNumResult = compareNum1.compareTo(compareNum2);
				if(compareNumResult < 0) {
					minNum = j;
				}
			}
			if(i != minNum) {
				String tmp = cardNumSelectionSort[i];
				cardNumSelectionSort[i] = cardNumSelectionSort[minNum];
				cardNumSelectionSort[minNum] = tmp;
			}
		}

		printArray(cardNumSelectionSort);

		if(isStable(card, cardNumSelectionSort)) {
			System.out.println("Stable");
		} else {
			System.out.println("Not stable");
		}
	}
}