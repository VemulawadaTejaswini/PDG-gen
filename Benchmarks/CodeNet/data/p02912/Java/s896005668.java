
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
        for(int j = 0; j < M; j++){
            int i_max = 0;
            long max = 0;
            for (int i=0; i<A.length; i++) {
                if (max < A[i]) {
                    max = A[i];
                    i_max = i;
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





