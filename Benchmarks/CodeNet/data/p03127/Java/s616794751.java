//2019/04/07
import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[] A = new int[N];

		for(int i=0;i<N;i++) {

			A[i] = sc.nextInt();
		}

		Arrays.parallelSort(A);

		int INF = Integer.MAX_VALUE;

		while(true) {

			if(A[1]==INF) break;

			for(int i=1;i<N;i++) {

				if(A[i]%A[0]==0) A[i] = INF;

				else A[i] = A[i]%A[0];
			}

			Arrays.parallelSort(A);


		}

		System.out.println(A[0]);
	}

}
