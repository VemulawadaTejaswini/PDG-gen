import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int  num = scanner.nextInt();//要素数
		int array[] = new int[num];
		int count = 0;
		
		for(int i = 0; i < num; i ++ ){
			array[i] = scanner.nextInt();
		}
		
		count = bubbleSort(array, num);

		System.out.println(count);
		
		scanner.close();
	}

	public static int bubbleSort( int[] numArray, int num){ // N 個の要素を含む 0-オリジンの配列 A
		int count = 0;
		
		//バブルソート処理
		for (int i = 0; i < num - 1; i++) {
				for (int j = num - 1; j > i; j--) {
					if (numArray[j - 1] > numArray[j]) {
						int work = numArray[j - 1];
						numArray[j - 1] = numArray[j];
						numArray[j] = work;
						count++;
					}
				}
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
		return count;
	}
}
