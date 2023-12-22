import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] H = new int[N];
		boolean[] h = new boolean[N];
		int[] A = new int[M];
		int[] B = new int[M];
		for(int i=0; i<N; i++) {
			h[i] = true;
			H[i] = sc.nextInt();
		}

		for(int j=0; j<M; j++) {
			A[j] = sc.nextInt();
			B[j] = sc.nextInt();
			if(H[A[j]-1]<H[B[j]-1]) {
				h[A[j]] = false;
			}
		}


		sc.close();
		int s=0;
		for(int i=0; i<N; i++) {
			if(h[i])
				s++;
		}
		System.out.println(s);
	}

}