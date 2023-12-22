import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			int N = scn.nextInt();
			int M = scn.nextInt();

			int[] A = new int[M];
			int[] B = new int[M];
			int[] Aroom = new int[M];
			int[] Broom = new int[M];

			boolean flg = false;
			for(int i = 0; i < M; i++) {
				A[i] = scn.nextInt();
				B[i] = scn.nextInt();

				if(A[i] == 1) {
					Broom[B[i]-1] = 1;
					flg = true;
				}
				if(B[i] == 1) {
					Aroom[A[i]-1] = 1;
					flg = true;
				}
			}

			if(!flg) {
				System.out.println("No");
				System.exit(0);
			}

			int now = 1;
			for(int k = 0; k < N; k++) {
				for(int i = 0; i < M; i++) {
					int tmpA = Aroom[i];
					int tmpB = Broom[i];
					int target = 0;
					if(A[i] == now) {
						target = B[i];
					} else if(B[i] == now) {
						target = A[i];
					} else {
						continue;
					}

					for(int j = 1; j < M; j++) {
						if (i == j) continue;
						int serachA = A[j];
						int serachB = B[j];

						if(A[j] == target) {
							if(Broom[B[j]-1] == 0) Broom[B[j]-1] = A[j];
						} else if(B[j] == target) {
							if(Aroom[A[j]-1] == 0) Aroom[A[j]-1] = B[j];
						}
					}
				}
				now++;
			}

			System.out.println("Yes");
			for(int i = 1; i < M; i++) {
				if(Aroom[i] == 0 && Broom[i] == 0) continue;
				System.out.println(Math.max(Aroom[i], Broom[i]));
			}
		}
	}
}