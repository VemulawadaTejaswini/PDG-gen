import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int numberOfData = Integer.parseInt(in.readLine());
		String[] strData = in.readLine().split(" ");
		TrampCard[] trampCards = new TrampCard[numberOfData], bubbleSorts = new TrampCard[numberOfData], selectionSorts = new TrampCard[numberOfData];
		for (int i = 0; i < numberOfData; i++) {
			trampCards[i] = new TrampCard(strData[i]);
		}
		System.arraycopy(trampCards, 0, bubbleSorts, 0, numberOfData);
		System.arraycopy(trampCards, 0, selectionSorts, 0, numberOfData);
		bubbleSort(numberOfData, bubbleSorts);
		sortResult(numberOfData, bubbleSorts);
		stableCheck(numberOfData, trampCards, bubbleSorts);
		selectionSort(numberOfData, selectionSorts);
		sortResult(numberOfData, selectionSorts);
		stableCheck(numberOfData, trampCards, selectionSorts);
	}

	public static void selectionSort(int numberOfData, TrampCard[] cards) {
		int min;
		for (byte x = 0; x < numberOfData; x++) {
			min = x;
			for (int y = x + 1; y < numberOfData; y++) {
				if (cards[min].readNum() > cards[y].readNum()) {
					min = y;
				}
			}
			if (cards[x].readNum() > cards[min].readNum()) {
				TrampCard temp = cards[x];
				cards[x] = cards[min];
				cards[min] = temp;
			}
		}
	}

	public static void bubbleSort(int numberOfData, TrampCard[] cards) {
		for (int x = 0; x < numberOfData; x++) {
			for (int y = numberOfData - 1; y > x; y--) {
				if (cards[y].readNum() < cards[y - 1].readNum()) {
					TrampCard temp = cards[y];
					cards[y] = cards[y - 1];
					cards[y - 1] = temp;
				}
			}
		}
	}

	public static void sortResult(int numberOfData, TrampCard[] sorts) {
		for (int z = 0; z < numberOfData; z++) {
			if (z == numberOfData - 1) {
				System.out.println(sorts[z].readData());
			} else {
				System.out.print(sorts[z].readData() + " ");
			}
		}
	}

	public static void stableCheck(int numberOfData, TrampCard[] inputCards,
			TrampCard[] outputCards) {
		boolean check = true;
		for (int n = 0; n < numberOfData; n++) {
			for (int m = n + 1; m < numberOfData; m++) {
				for (int x = 0; x < numberOfData; x++) {
					for (int y = x + 1; y < numberOfData; y++) {
						if (inputCards[n].num == inputCards[m].num
								&& inputCards[n].mark == outputCards[y].mark
								&& inputCards[m].mark == outputCards[x].mark) {
							check = false;
							break;
						}
					}
					if (!check) {
						break;
					}
				}
				if (!check) {
					break;
				}
			}
			if (!check) {
				break;
			}
		}
		if (check) {
			System.out.println("Stable");
		} else {
			System.out.println("Not stable");
		}
	}
}

class TrampCard {
	String card;
	char mark;
	int num;

	public TrampCard() {
	}

	public TrampCard(String card) {
		this.mark = card.charAt(0);
		this.num = Integer.parseInt(card.substring(1));
	}

	public String readData() {
		return String.valueOf(mark) + String.valueOf(num);
	}

	public char readMark() {
		return mark;
	}

	public int readNum() {
		return num;
	}
}