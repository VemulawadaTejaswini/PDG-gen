import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int C = sc.nextInt();

        int[] B = new int[M];
        for(int i=0; i<M; i++){
            B[i] = sc.nextInt();
        }

        int[][] A = new int[N][M];
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                A[i][j] = sc.nextInt();
            }
        }

        sc.close();

        int count = 0;

        for(int i=0; i<N; i++){
            int sum = C;

            for(int j=0; j<M; j++){
                sum += A[i][j] * B[j];
            }

            if(sum > 0){
                count++;
            }
        }

        System.out.println(count);

    }
}
