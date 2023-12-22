import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);

                int N = scan.nextInt();
                int M = scan.nextInt();
                int K = scan.nextInt();

                int[] A = new int[N];
                int[] B = new int[M];

                for (int n = 0; n < N; n++) {
                	A[n] = scan.nextInt();
                }

                for (int m = 0; m < M; m++) {
                	B[m] = scan.nextInt();
                }

                int Aposition = 0;
                int Bposition = 0;

                for (int nm = 0; nm < N+M; nm++) {

                	if (Bposition >= M || (Aposition < N && A[Aposition] < B[Bposition])) {
                		if (K - A[Aposition] < 0) {
                			break;
                		}
                		K -= A[Aposition];
                		Aposition++;
                	} else if (Aposition >= N || (Bposition < M && B[Bposition] < A[Aposition])) {
                		if (K - B[Bposition] < 0) {
                			break;
                		}
                		K -= B[Bposition];
                		Bposition++;
                	}
                }

                System.out.println(Aposition + Bposition);

                scan.close();

        }

}