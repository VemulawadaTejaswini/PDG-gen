import java.util.Scanner;

//Stable Sort
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		//準備
		Card[] card = new Card[num];
		for (int i = 0; i < num; i++) {
			card[i] = Card.newInstance(scan.next());
		}
		Card[] copycard = card;
		//バブルソート
		Card[] sortAfter = bubbleSort(copycard, num);

		System.out.print(sortAfter[0]);
		for (int i = 1; i < num; i++) {
			System.out.print(" " + sortAfter[i].toString());
		}
		//バブルソートおわり
		System.out.println();
		
		int M = 100;
		Card[] hoge = new Card[num];
		String ans = "Stable";
		for(int i = 0; i  < M ;i++){
			copycard = card;
			hoge = bubbleSort(copycard,num);
			if(!hoge.equals(sortAfter)){
				ans = "Not Stable";
			}
		}
		System.out.println(ans);
		//バブルソートの安定性確認
		
		//セレクションソート
		copycard = card;
		Card[] selectAfter = selectionSort(copycard,num);

		
		int N = 10000;
		Card[] hikaku = new Card[num];
		String stab = "Stable";
	
		System.out.print(selectAfter[0]);
		for (int i = 1; i < num; i++) {
			System.out.print(" " + selectAfter[i].toString());
		}
		//セレクトソートの安定性確認
		
		for(int i = 0;i < num; i++){
			if(sortAfter[i] != selectAfter[i]){
				stab = "Not";
				break;
			}
		}
		System.out.println();
		System.out.println(stab);
	}

	/**
	 * バブルソート
	 * 
	 * @param A
	 *            ソートする配列
	 * @param N
	 *            ソートする個数
	 * @return 昇順にソートされた配列
	 */
	public static Card[] bubbleSort(Card[] A, int N) {
		boolean flag = true;
		while (flag) {
			flag = false;
			for (int j = N - 1; j >= 1; j--) {
				if (A[j].getNumber() < A[j - 1].getNumber()) {
					Card tmp;
					tmp = A[j];
					A[j] = A[j - 1];
					A[j - 1] = tmp;
					flag = true;
				}
			}
		}
		return A;
	}

	/**
	 * セレクションソート。一番小さい値を選択して入れ替える。
	 * 
	 * @param A配列
	 * @param N配列の数
	 * @return入れ替え後の配列
	 */
	public static Card[] selectionSort(Card[] A, int N) {

		for (int i = 0; i < N; i++) {
			int mini = i;
			for (int j = i; j < N; j++) {
				if (A[j].getNumber() < A[mini].getNumber()) {
					mini = j;
				}
			}
			if (mini != i) {
				Card tmp;
				tmp = A[i];
				A[i] = A[mini];
				A[mini] = tmp;
			}

		}

		return A;
	}

	

	private static class Card {
		private String mark;
		private int number;

		private Card(String str) {
			mark = str.substring(0, 1);
			number = Integer.valueOf(str.substring(1));
		}

		public static Card newInstance(String str) {
			return new Card(str);
		}

		public int getNumber() {
			return number;
		}

		public String getMark() {
			return mark;
		}

		@Override
		public String toString() {
			return mark + number;
		}
	}

}

