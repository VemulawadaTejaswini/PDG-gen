import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        int[] A = new int[N + 1];
        int[] B = new int[M + 1];
        A[N] = 0;
        B[N] = 0;
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < M; i++) {
            B[i] = sc.nextInt();
        }
        int T = 0;
        int a = A[0];
        int b = B[0];
        int Ca = 0;
        int Cb = 0;
        while ( T <= K ) {
            if ( a > 0 && a > b ) {
                T = T + a;
                Ca = Ca + 1;
                a = A[Ca];
            } else if (b > 0 && b >= a){
                T = T + b;
                Cb = Cb + 1;
                b = B[Cb];
            } else {
                break;
            }
        }
        System.out.println(Ca + Cb);
    }
}