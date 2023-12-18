import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		int n = sc.nextInt();
		int x = sc.nextInt();
		int cnt = 0;
		long tmp = 0;

		Integer array[] = new Integer[n];
		long arySum[] = new long[n + 1];
		arySum[0] = 0;

		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
			//加算
			tmp = tmp + array[i];
			arySum[i + 1] = tmp;
		}

		for (int j = 0; j < n; j++) {
			if(arySum[j] <= x){
				cnt++;
			}
		}

		System.out.println(cnt);

		sc.close();
	}
}
