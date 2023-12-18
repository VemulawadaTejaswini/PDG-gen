import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int N = reader.nextInt();
		int[][] arr = new int[N][2];
		for (int i = 0; i < N; i++) {
			arr[i][0] = reader.nextInt();
			arr[i][1]  = reader.nextInt();

		}
		for (int i = 0; i < N; i++) {
			int ans = 0;
			for (int j = arr[i][0]; j <= arr[i][1]; j+=2) {
				if (isPrime((j+1)/2) && isPrime(j)) {
					ans++;
				}
			}
			System.out.println(ans);
		}

		reader.close();

	}
	public static boolean isPrime(int num) {
		boolean result = true;
		if (num == 1) {
			return false;
		}
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				result = false;
			}
		}
		return result;
	}
}



