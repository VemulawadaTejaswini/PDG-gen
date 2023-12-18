import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		int n = sc.nextInt();
		int[] vals = new int[n];
		int count = 1;

		// 整数の取得
		for (int i = 0; i < n; i++) {
			vals[i] = sc.nextInt();
		}

		for (int j = 1; j < vals.length; j++) {
			int num = vals[j];

			if(j < vals.length - 1){
				int next = vals[j+1];
				if(num <= next && vals[0] <= next){
					count++;
				}
			}else{
				if(vals[j-1] <= vals[j] && vals[0] <= vals[j]){
					count++;
				}
			}
		}

		System.out.println(count);

		sc.close();
	}
}
