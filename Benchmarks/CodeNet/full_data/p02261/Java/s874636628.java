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

		Card[] bubbleBefore = copyCard(card);
		Card[] selectBefore = copyCard(card);
		
		//バブルソート
		Card[] bubbleAfter = bubbleSort(bubbleBefore, num);
		//バブルソート出力
		System.out.print(bubbleAfter[0]);
		for (int i = 1; i < num; i++) {
			System.out.print(" " + bubbleAfter[i].toString());
		}
		System.out.println();
		System.out.println(stableCheck(bubbleAfter,card));

		//セレクションソート
		Card[] selectAfter = selectionSort(selectBefore,num);
		//セレクトソート出力
		System.out.print(selectAfter[0]);
		for (int i = 1; i < num; i++) {
			System.out.print(" " + selectAfter[i].toString());
		}
		System.out.println();
		System.out.println(stableCheck(selectAfter,card));
		System.out.println();
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

	public   static String stableCheck(Card[] Aftersort, Card[] Input){
		int i;
		int temae_no_card_no_ichi=0;
		int ato_no_card_no_ichi =0;
		for(i=0;i<Input.length-1;i++){
			if((Aftersort[i].getNumber())==(Aftersort[i+1].getNumber())){
				for(int j = 0; j < Input.length;j++){
					if(Aftersort[i].toString().equals(Input[j].toString())){//H5 =H5
					 temae_no_card_no_ichi = j;
					}
					if(Aftersort[i+1].toString().equals(Input[j].toString())){
						 ato_no_card_no_ichi = j;
					}
				}
			}
		}
		if(temae_no_card_no_ichi > ato_no_card_no_ichi){
			return "Not Stable";
		}
		return "Stable";

	}
	
	public static Card[] copyCard(Card[] card){
		
		Card[] copycard =  new Card[card.length];
		for (int i = 0; i < card.length; i++) {
			copycard[i] = Card.newInstance(card[i].toString());
		}
		return copycard;
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

