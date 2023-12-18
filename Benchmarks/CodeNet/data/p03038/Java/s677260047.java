import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[M];
        int[] C = new int[M];

        int maxS = 0;

        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }

        Arrays.sort(A);
        
        for(int i = 0; i < M; i++){
            B[i] = sc.nextInt();
            C[i] = sc.nextInt();
        }

        for(int i = 0; i < M; i++){
            int sum = C[i] * B[i];
            for(int k = B[i]; k < N; k++){ 
                sum += A[k];
            }
            if(sum > maxS)
                maxS = sum;
        }

        System.out.println(maxS);


    }
}
