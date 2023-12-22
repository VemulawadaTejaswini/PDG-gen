import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] cards1 = new String[n];
        String[] cards2 = new String[n];
        for(int i = 0; i < n; i++) {
        	String s = sc.next();
        	cards1[i] = s;
        	cards2[i] = s;
        }


        String[] bs = bubbleSort(cards1);
        System.out.println("Stable");

        String[] ss = selectionSort(cards2);
        isStable(cards2, ss);

	}

	static String[] bubbleSort(String[] cards) {

		for(int i = 0; i < cards.length; i++) {
			for(int j = cards.length - 1; j > i; j--) {
				if(getNumber(cards[j-1]) > getNumber(cards[j])) {
					String temp = cards[j-1];
					cards[j-1] = cards[j];
					cards[j] = temp;
				}
			}
		}
		printArray(cards);
		return cards;
	}

	static String[] selectionSort(String[] cards) {

		for(int i = 0; i < cards.length; i++) {
			int minj = i;
			for(int j = i; j < cards.length; j++) {
				if(getNumber(cards[j]) < getNumber(cards[minj])) {
					minj = j;
				}
			}
			String temp = cards[i];
			cards[i] = cards[minj];
			cards[minj] = temp;
		}
		printArray(cards);
		return cards;
	}

	static int getNumber(String str) {
		return Integer.parseInt(str.substring(1));
	}

	static boolean isStable(String[] in, String[] out) {
		for(int i = 0; i < in.length; i++) {
			for(int j = i + 1; j < in.length; j++) {
				for(int a = 0; a < in.length; a++) {
					for(int b = a + 1; b < in.length; b++) {
						if(getNumber(in[i]) == getNumber(in[j])
								&& getNumber(in[i]) == getNumber(out[b])
								&& getNumber(in[j]) == getNumber(out[a])) {
							System.out.println("Not stable");
							return false;
						}
					}
				}
			}
		}
		System.out.println("Stable");
		return true;
	}

	static void printArray(String[] strArray) {
		for(int i = 0; i < strArray.length - 1; i++) {
			System.out.print(strArray[i] + " ");
		}
		System.out.println(strArray[strArray.length - 1]);
	}
}

