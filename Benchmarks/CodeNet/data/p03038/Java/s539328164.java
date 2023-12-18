import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] A = new int[N];

        for (int i=0; i<N; i++){
            A[i] = sc.nextInt();
        }
        int[] B = new int[N];
        int[] C = new int[N];
        for (int i=0; i < M; i++){
            B[i] = sc.nextInt();
            C[i] = sc.nextInt();
        }
        sc.close();

        int count=0;

        for (int i=0; i<M; i++){
            Arrays.sort(A);
            count = 0;
            for (int j=0; j<N; j++){
                if(C[i] > A[j]) {
                    A[j] = C[i];
                    count++;
                }else if(C[i] < A[j]){
                    break;
                }
                if (count == B[i]){
                    break;
                }
            }
        }

        long result=0;
        for (int i=0; i<N; i++){
            result += A[i];
        }
        System .out.println(result);

    }
}