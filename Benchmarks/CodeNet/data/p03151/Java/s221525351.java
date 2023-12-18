import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().execute();
	}

	public void execute() {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		sc.nextLine();
		int A[] = new int[N];
		int B[] = new int[N];
		int[] diff = new int[N];
		long totalJunbi = 0;
		long totalScore = 0;

		String[] a = sc.nextLine().split(" ");
		String[] b = sc.nextLine().split(" ");
		for (int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(a[i]);
			B[i] = Integer.parseInt(b[i]);
			totalJunbi += A[i];
			totalScore += B[i];
			diff[i] =  A[i] - B[i];
		}

		if (totalJunbi < totalScore) {
			System.out.println(-1);
			sc.close();
			return;
		}

		Arrays.sort(diff);
		int m = -1;
		int p = diff.length;
		int cnt = 0;
		int minus = 0;
		int plus = 0;
		while (true) {
			if (minus == 0) {
				m++;
				if (diff[m] >= 0) {
					break;
				}
				minus = diff[m];
				cnt++;
			}
			if (plus == 0) {
				p--;
				plus = diff[p];
				cnt++;
			}
			if (minus + plus >= 0) {
				plus += minus;
				minus = 0;
			} else {
				minus += plus;
				plus = 0;
			}
		}
		System.out.println(cnt);

		sc.close();

	}

}
