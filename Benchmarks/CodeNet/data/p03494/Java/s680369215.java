import java.util.Scanner;

public class ShiftOnly {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		boolean flag = true;
		int ans = 0;
		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}

		while (flag) {
			for (int j = 0; j < N; j++) {
				if (A[j] % 2 != 0) {
					flag = false;
				}
			}
			if(flag == false) break;
			for (int k = 0; k < N; k++) {
				A[k] = A[k] / 2;
			}
			ans++;

		}

		System.out.println(ans);

	}
}
