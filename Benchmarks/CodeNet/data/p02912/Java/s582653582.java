import java.util.Scanner;

//AtCoder Beginner Contest 141
//D	Powerful Discount Tickets
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());

		int[] arrA = new int[N];
		for (int i = 0; i < N; i++) {
			arrA[i] = Integer.parseInt(sc.next());
		}
		sc.close();

		for (int m = 0; m < M; m++) {
			int max = 0;
			int maxIndex = 0;
			for (int n = 0; n < N; n++) {
				if (arrA[n] > max) {
					maxIndex = n;
					max = arrA[n];
				}
			}
			arrA[maxIndex] = arrA[maxIndex] >> 1;
		}

		long ans = 0;
		for (int n = 0; n < N; n++) {
			ans += arrA[n];
		}

		System.out.println(ans);
	}
}
