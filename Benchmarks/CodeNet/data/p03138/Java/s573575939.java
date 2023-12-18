import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.next());
		Long K = Long.parseLong(sc.next());

		long[] A = new long[N];

		for(int i = 0; i < N; i++) {
			A[i] = sc.nextLong();
		}


		long sum = 0;
		for(int X = 0; X <= K; X++) {

			long tmp = 0;
			for(int i = 0;i < N;i++) {
				tmp += X ^ A[i];
			}
			if(sum < tmp) {
				sum = tmp;
			}



		}
		System.out.println(sum);
	}

}
