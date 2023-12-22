import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int  num = scanner.nextInt();//要素数
		int array[] = new int[num];
		
		for(int i = 0; i < num; i ++ ){
			array[i] = scanner.nextInt();
		}
		
		selectionSort(array, num);
		
		scanner.close();
	}

	public static void selectionSort( int[] numArray, int num){
		int count = 0;
		
		//選択ソート
		for (int i = 0; i < num - 1; i++) {
			// 比較元の配列番号をセットする
			int comp = i;
			// 最小値の探索
			for (int j = i + 1; j < num; j++) {
				if (numArray[comp] > numArray[j]) {
					// 最少値設定
					comp = j;
				}
			}
			// 最小値が入れ替わっていなければ数値を入れ替えない
			if (i == comp) {
				continue;
			}
			//入れ替え処理
			int sub = numArray[i];
			numArray[i] = numArray[comp];
			numArray[comp] = sub;
			count++;		//入れ替えたので足しこむ
		}
		//出力
		for(int i = 0; i < num; i ++ ){
			System.out.print(numArray[i]);
			if( i == num - 1) {
			System.out.print("\n");
			}else {
				System.out.print(" ");
			}
		}
		System.out.println(count);
	}
}
