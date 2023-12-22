import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//int bitArray[] = new int[n];

		int k = sc.nextInt();
		int bitArray[] = new int[k];
		int mask[] = new int[k];
		for(int i = 0; i < k; i++) {
			mask[i] = sc.nextInt();
		}

		for(int i = 0; i < Math.pow(2, k); i++) {
			int temp = i;
			int index = 0;
			for(int j = 0; temp > 0; j++) {
				if(temp % 2 == 1) {
					bitArray[j] = 1;
					index += Math.pow(2, mask[j]);
				}
				temp /= 2;
			}

			System.out.print(index + ":");  //順列のインデックス
			for(int j = 0; j < k; j++) {
				if(bitArray[j] == 1) System.out.print(" " + mask[j]);
			}
			System.out.println();
		}
	}

}

