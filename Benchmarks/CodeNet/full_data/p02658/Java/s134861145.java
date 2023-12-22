import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long N = scn.nextInt();
		long[] arr = new long[(int) N];
		int zero = 0;
		for (int i = 0; i < N; i++) {
			arr[i] = scn.nextLong();
			if (arr[i] == 0) {
				zero++;
			}
		}
		if (zero != 0) {
			System.out.println(0);
		} else {
			long ans = 1;
			boolean check = true;
			for (int i = 0; i < N; i++) {
				if (ans * arr[i] >= 0 && ans * arr[i] <= 1000000000000000000L) {
					ans = ans * arr[i];
				} else {
					check = false;
					System.out.println(-1);
				}
			}
			if (check) {
				System.out.println(ans);
			}
		}
	}
}