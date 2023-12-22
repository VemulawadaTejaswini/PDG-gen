import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 入力の受け取り
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];

		int cnt1 = 0;
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
			if (A[i] == 1)cnt1++;
		}

		int cnt = 0;
		for (int i = 0; i < N; i++) {
			if(cnt1 == 1) {
				cnt = 1;
				break;
			} else if (cnt1 > 1) {
				cnt = 0;
			}

			int flag = 1;
			for (int j = 0; j < N; j++) {
				if (i != j) {
					if (A[i] >= A[j] && A[i] % A[j] == 0) {
						flag = 0;
						break;
					}
				}
			}

			cnt += flag;
		}

		System.out.println(cnt);

		sc.close();
	}
}
