import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);

                int N = scan.nextInt();
                int K = scan.nextInt();

                int[] A = new int[N];
                int[] B;

                for (int i = 0; i < N; i++) {
                	A[i] = scan.nextInt();
                }

                scan.close();

	                int log2N = 0;
	                int tempN = N;

	                while (tempN == 1) {
	                	tempN /= 2;
	                	log2N++;
	                }

                if (K >= log2N + 3) {

                	for (int k = 0; k < N; k++) {
                    	System.out.print(N + " ");
                    }

                    System.out.println();

                } else {

	                for (int j = 0; j < K; j++) {

	                	 B = new int[N];

	                	for (int n1 = 0; n1 < N; n1++) {

	                		if (n1 - A[n1] > 0) {
	                			B[n1 - A[n1]]++;
	                		} else {
	                			B[0]++;
	                		}

	                		if (n1 + A[n1] + 1 < N) {
	                			B[n1 + A[n1] + 1]--;
	                		}

	                	}

	                	for (int n2 = 0; n2 < N-1; n2++) {
	                		B[n2+1] += B[n2];

	                	}

	                	A = B;

	                }

	                for (int k = 0; k < N; k++) {
	                	System.out.print(A[k] + " ");
	                }

	                System.out.println();

                }

        }

}