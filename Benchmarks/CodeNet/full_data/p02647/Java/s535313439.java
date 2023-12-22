import java.util.*;
import static java.lang.Math.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        K = Math.min(K, 41)

        Integer A[] = new Integer[N];
        int[] coord = new int[N];
        for (int i=0; i<N; i++) {
            A[i] = sc.nextInt();
            coord[i] = i+1;
        }

        for (int j=0; j<K; j++){
            Integer B[] = new Integer[N];

            for (int i=0; i<N; i++){
                int[] coord2 = new int[N];
                for (int k=0; k<N; k++){
                    coord2[k] = abs(coord[k] - coord[i]);
                }
                int cnt = 0;
                for (int k=0; k<N; k++){
                    if ( A[k] >= coord2[k] ){
                        cnt++;
                    }
                }
                B[i] = cnt;
            }
            for (int i=0; i<N; i++){
                A[i] = B[i];
            }
        }
        for (int i=0; i<N-1; i++){
            System.out.print(A[i] + " ");
        }
        System.out.print(A[N-1]);
        
    }
}