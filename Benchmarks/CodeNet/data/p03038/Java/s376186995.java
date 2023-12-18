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

        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }

        Arrays.sort(A);

        for(int i = 0; i < M; i++){
            B[i] = sc.nextInt();
            C[i] = sc.nextInt();
        }

        for(int i = 0; i < M; i++){
            Arrays.sort(A);
            for(int k = 0; k < B[i]; k++){
                A[k] = C[i];
            }
        }
        
        int sum = 0;
        for(int i = 0; i < N; i++){
            sum += A[i];
        }
        System.out.println(sum);


    }
}
