import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] cards1 = new String[N];
		String[] cards2 = new String[N];
		String[] origin = new String[N];
		for(int i = 0; i < N; i++) {
			cards1[i] = sc.next();
		}
		System.arraycopy(cards1, 0, cards2, 0, N);  // cards1をcards2にコピー
		System.arraycopy(cards1, 0, origin, 0, N);

		bubbleSort(cards1, N);
		showArray(cards1);
		if(isStable(origin, cards1)) {
			System.out.println("Stable");
		}else {
			System.out.println("Not stable");
		}

		selectionSort(cards2, N);
		showArray(cards2);
		if(isStable(origin, cards2)) {
			System.out.println("Stable");
		}else {
			System.out.println("Not stable");
		}
		sc.close();
	}

	// ちなみにバブルソートは常に安定なソート
	public static void bubbleSort(String[] cards, int N) {
		for(int i = 0; i < N; i++) {
			for(int j = N - 1; j > i; j--) {
				if(getCardValue(cards[j]) < getCardValue(cards[j-1])) {
					String tmp = cards[j];
					cards[j] = cards[j-1];
					cards[j-1] = tmp;
				}
			}
		}
	}

	public static void selectionSort(String[] cards, int N) {
		for(int i = 0; i < N; i++) {
			int minj = i;
			for(int j = i+1; j < N; j++) {
				if(getCardValue(cards[j]) < getCardValue(cards[minj])) {
					minj = j;
				}
			}
			if(i != minj) {
				String tmp = cards[minj];
				cards[minj] = cards[i];
				cards[i] = tmp;
			}
		}
	}

	// 例："H9"という文字列から整数値9を取り出す
	public static int getCardValue(String s) {
		char c = s.charAt(1);
		String str = String.valueOf(c);
		return Integer.parseInt(str);
	}

	public static void showArray(String[] s) {
		System.out.print(s[0]);
		for(int i = 1; i < s.length; i++) {
			System.out.print(" " + s[i]);
		}
		System.out.println();
	}

	// ソート前後の配列を比べて、そのソートが安定かどうか判定(本課題のキモ)
	public static boolean isStable(String[] a, String[] b) {
		for(int i = 0; i < a.length; i++) {
			for(int j = i+1; j < a.length; j++) {
				for(int x = 0; x < a.length; x++) {
					for(int y = x+1; y < a.length; y++) {
						if(getCardValue(a[i]) == getCardValue(a[j]) && a[i].equals(b[y]) && a[j].equals(b[x])) {
							return false;
						}
					}
				}
			}
		}
		return true;
	}
}
