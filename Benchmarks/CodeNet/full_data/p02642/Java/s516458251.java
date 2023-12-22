import java.util.Arrays;
import java.util.Scanner;

public class Main {
	//java11

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		Integer[] A = new Integer[N];
		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt();
		}

		int ans = 0;
		Arrays.sort(A);
		boolean[] judges = new boolean[N];
		for(int i=0; i<N; i++) {
			judges[i] = true;
			for(int j=0; j<Math.min(i+2, N); j++) {
				if(i == j)
					continue;

				if(A[i] % A[j] == 0) {
//					System.out.println(A[i] + "%" + A[j]);
					judges[i] = false;
					break;
				}
			}

			if(judges[i]) {
//				System.out.println(A[i]);
				ans++;
			}
		}

		System.out.println(ans);
	}

}
