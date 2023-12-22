
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		long[] A = new long[N];
		for(int i=0; i<N; i++) {
			A[i] = sc.nextLong();
			if(A[i]==0) {
				System.out.println(0);
				return;
			}
		}

		long sum = 1;

		try {
			for(int i=0; i < N; i++) {
				sum *= A[i];
				if(sum < 0) {
					System.out.println(-1);
					return;
				}
			}
		}catch(Exception e) {
			System.out.println(-1);
		}


		if(sum <= 1000000000000000000l) {
			System.out.println(sum);
		}else {
			System.out.println(-1);
		}

	}
}

