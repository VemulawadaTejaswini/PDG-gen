
import java.util.*;
import java.lang.*;

class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        long A[] = new long[N];
        for(int i = 0; i < N; i++){
        A[i] = sc.nextInt();
        }
        Arrays.sort(A);

        for(int j = 0; j < M; j++){
            int i_max = 0;
            long max = 0;
            for (int i=0; i<j+1; i++) {
                if (max < A[M-1-i]) {
                    max = A[M-1-i];
                    i_max = M-1-i;
                }
            }
            A[i_max] = A[i_max] / 2;
        }

        long minSum = 0;
        for(int i = 0; i < N; i++){
            minSum += A[i];
        }

        System.out.println(minSum);

    }
}





