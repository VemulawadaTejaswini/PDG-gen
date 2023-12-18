import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int M = scan.nextInt();
		int Q = scan.nextInt();
		List<int[]> list = new ArrayList<>();
		long answer = 0;

		for (int i = 0; i < Q; i++) {
			int[] temp = new int[4];
			for (int k = 0; k < 4; k++) {
				temp[k] = scan.nextInt();
			}
			list.add(temp);
		}

		int[] d = new int[M + 1];
		for (int i = 1; i <= M; i++) d[i] = 1;

		int[] A = new int[M];
		while (d[0] <= 0){
			long temp = 0;
			for (int i = 1; i <= N; i++) A[i - 1] = d[i];

			for (int[] nums : list) {
				if (A[nums[1] - 1] - A[nums[0] - 1] == nums[2]) temp += nums[3];
			}
			answer = Math.max(temp, answer);

			for (int i = N; 0 <= i; i--){
				d[i]++;
				for (int k = i + 1; k <= N; k++) d[k] = d[k - 1];
				if (d[i] <= M)break;
			}
		}

		System.out.println(answer);
	}
}