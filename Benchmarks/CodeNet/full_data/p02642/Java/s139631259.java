import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 入力の受け取り
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];

		boolean flag1 = false;
		boolean flag2 = false;
		int id2 = -1;
		boolean flag3 = false;
		int id3 = -1;
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
			flag1 = A[i] == 1;
			flag2 = A[i] == 2;
			if (flag2) {
				id2 = i;
			}
			flag3 = A[i] == 3;
			if (flag3) {
				id3 = i;
			}
		}

		int cnt = 0;

		for (int i = 0; i < N; i++) {
			int flag = 1;
			if(flag1) {
				cnt = N;
				break;
			}
			if(flag2) {
				if (i != id2 && A[i] % 2 == 0) {
					cnt++;
					continue;
				}
			}
			if(flag3) {
				if (i != id3 && A[i] % 3 == 0) {
					cnt++;
					continue;
				}
			}

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
