import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		solve();

	}

	public static void solve() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int num = sc.nextInt();
			int min = sc.nextInt();
			int max = sc.nextInt();

			if (num == 0 && min == 0 && max == 0) {
				break;
			}

			int[] Tensu = new int[num];
			for (int i = 0; i < num; i++) {
				Tensu[i] = sc.nextInt();
			}

			int passNum = max - min + 1;
			int[] Gap = new int[passNum];
			int ans = 0;
			int BL = 0;

			for (int j = min; j < max + 1; j++) {
				Gap[j - min] = Tensu[j - 1] - Tensu[j];
			}

			for (int k = 0; k < Gap.length; k++) {
				if (ans <= Gap[k]) {
					ans = Gap[k];
					BL = k;

				}

			}

			System.out.println(BL + min);
		}

	}
}