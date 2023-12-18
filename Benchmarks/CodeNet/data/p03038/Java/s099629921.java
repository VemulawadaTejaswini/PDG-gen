import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		Scanner sc  = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();

		int[] A = new int[N];
		for(int i=0;i<N;i++) {
			A[i] = sc.nextInt();
		}
		Arrays.sort(A);

		int[][] bc = new int[M][2];
		for(int i=0;i<M;i++) {
			bc[i][0] = sc.nextInt();
			bc[i][1] = sc.nextInt();
		}
		Arrays.sort(bc,(a,b)->Integer.compare(b[1], a[1]));

		long ans = 0;
		for(int i=0;i<M;i++) {
			if(A[0] > bc[i][1]) break;
			for(int j=0;j<bc[i][0];j++) {
//				System.out.println(A[j]+" "+bc[i][1]);
				if(A[j] < bc[i][1]) {
					A[j] = bc[i][1];
				}
			}
			Arrays.sort(A);
//			System.out.println(Arrays.toString(A));
		}

		for(int i=0;i<A.length;i++) {
			ans += A[i];
		}
		System.out.println(ans);
	}
}