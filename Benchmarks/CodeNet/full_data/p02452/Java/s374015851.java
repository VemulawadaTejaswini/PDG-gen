import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arrayA[] = new int[n];

		for(int i = 0; i < n; i++) {
			arrayA[i] = sc.nextInt();
		}

		int m = sc.nextInt();
		for(int i = 0; i < m; i++) {  //配列Bの要素のループ
			int key = sc.nextInt();

			BinarySearch bi = new BinarySearch();
			if(bi.binarySearch(arrayA, key) == 0) {
				System.out.println(0);
				break;
			}
			if(i == m - 1) System.out.println(1);
		}
	}
}

class BinarySearch {
	public int binarySearch(int[] array, int key) {
		int pLeft = 0;
		int pRight = array.length - 1;

		do {
			int center = (pLeft + pRight) / 2;

			if (array[center] == key) {
				return 1;
			} else if (array[center] < key){
				pLeft = center + 1; //真ん中の一つ右側を左端とする
			} else {
				pRight = center - 1;
			}
		} while (pLeft <= pRight);

		return 0;
	}
}
