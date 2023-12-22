import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int bitArray[] = new int[n];

		int k = sc.nextInt();

		int mask[] = new int[k];
		for(int i = 0; i < k; i++) {
			mask[i] = sc.nextInt();
		}

		for(int i = 0; i < Math.pow(2, n); i++) {
			int temp = i;
			for(int j = 0; temp > 0; j++) {
				bitArray[j] =  temp % 2;
				temp /= 2;
			}

			boolean flag = false;  //bitArrayがmaskに当てはまっていなかったら反転
			for(int j = 0; j < k; j++) {
				if(bitArray[mask[j]] == 0) {
					flag = true;
					break;
				}
			}

			if(!flag) {
				System.out.print(i + ":");  //順列のインデックス
				for(int j = 0; j < n; j++) {
					if(bitArray[j] == 1) System.out.print(" " + j);
				}
			}
			if(!flag) System.out.println();
		}
	}

}

