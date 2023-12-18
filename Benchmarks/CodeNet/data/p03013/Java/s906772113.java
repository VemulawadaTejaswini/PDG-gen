import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		//    	File file = new File("src/in.txt");
		//    	Scanner sc = new Scanner(file);

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		//		System.out.println(solve(N));
		int M = sc.nextInt();
		int[] dangerStair = new int[M];
		boolean flg = true;
		for (int i = 0; i < M; i++) {
			dangerStair[i] = sc.nextInt();
			if (i > 0) {
				if (dangerStair[i] == dangerStair[i - 1] + 1) {
					flg = false;
				}
			}
		}
		if (flg == false) {
			System.out.println("0");
		} else {
			long ans = 1;
			if (M > 1) {
				for (int i = 0; i < M; i++) {
					if (i == 0) {
						ans = mod(ans * solve(dangerStair[i] - 1));
					} else {
						ans = mod(ans * solve(dangerStair[i] - dangerStair[i - 1] - 1));
					}
				}
				ans = mod(ans * solve(N - dangerStair[M - 1]));
			} else {
				ans = mod(solve(dangerStair[0] - 1) * solve(N - dangerStair[0] - 1));
			}
			System.out.println(ans);
		}

	}

	public static long solve(int N) {
		if (N == 0)
			return 1;
		long num1 = 1;
		long num2 = 1;
		long tmp = 1;
		for (int i = 1; i < N; i++) {
			tmp = mod(num1 + num2);
			num1 = mod(num2);
			num2 = mod(tmp);
		}
		return num1;

	}

	public static long mod(long N) {

		return (long) N % 1000000007;

	}

}
