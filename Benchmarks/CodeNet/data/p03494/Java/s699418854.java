import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		int[] B = new int[N];

		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt();
			B[i] = 0;

			while(A[i]%2 == 0) {
				A[i] = A[i]/2;
				B[i] += 1;
			}
		}

		int judge = 9;
		for(int j=0; j<N; j++) {
			if(B[j] < judge) {
				judge = B[j];
			}else {
				judge = judge;
			}
		}

		System.out.println(judge);

	}

}
