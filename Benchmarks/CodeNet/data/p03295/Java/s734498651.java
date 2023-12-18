import java.util.Arrays;
import java.util.Scanner;

public class Main {
	//java11

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		int[][] desire = new int[M][2];
		for(int i=0; i<M; i++) {
			desire[i][0] = sc.nextInt();
			desire[i][1] = sc.nextInt();
		}

		Arrays.sort(desire, (a, b) -> a[1] - b[1]);

		int index = 0;
		int ans = 0;
		while(index < M) {
			int end = desire[index][1];
			ans++;
			index++;

			while(index < M && desire[index][0] < end)
				index++;
		}

		System.out.println(ans);
	}
}
