import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] arr = new int[N];
		int max = 0;
		int[] con_arr = new int[N + 1];
		long all = 0;

		for (int i = 0; i < N; i++) {
			int let = sc.nextInt();
			arr[i] = let;
			con_arr[let]++;
		}

		for (int i = 1; i < N + 1; i++) {
			if (con_arr[i] > 0) {
				all += con_arr[i] * (con_arr[i] - 1) / 2;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			int bannd = arr[i];
			System.out.println(all - (con_arr[bannd] - 1));
		}
	}
}