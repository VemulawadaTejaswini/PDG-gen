import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] A = new int[N];
		int sum = 0;
		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt();
			sum += A[i];
		}

		Arrays.sort(A);
		String ans;
		if(A[N-M] < (double)sum / (4 * M))
			ans = "No";
		else
			ans = "Yes";

		System.out.println(ans);
	}

}

