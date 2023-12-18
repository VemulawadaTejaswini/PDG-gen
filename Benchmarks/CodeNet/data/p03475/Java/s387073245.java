import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int N = reader.nextInt();
		int[][] arr = new int[N-1][3];
		for (int i = 0; i < N-1; i++) {
			arr[i][0] = reader.nextInt();
			arr[i][1] = reader.nextInt();
			arr[i][2] = reader.nextInt();
		}
		for (int i = 0; i < N-1; i++) {
			int ans = arr[i][1] + arr[i][0];
			for (int j = i+1; j < N-1; j++) {
				ans += Math.max(0, arr[j][1] - ans);
				if (ans % arr[j][2] != 0) {
					ans =  (ans / arr[j][2] + 1) * arr[j][2];
				}
				ans += arr[j][0];
			}
			System.out.println(ans);
		}

		System.out.println(0);
		reader.close();
	}
}



