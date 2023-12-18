import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        System.out.println( solve(N, A) );
    }

    private static String solve(int N, int[] A) {
        StringBuilder b = new StringBuilder();
        if( N % 2 == 0 ) {
            // 4(3) 2(1) 1(0) 3(2)
            for (int i = N-1; i >= 1; i = i-2) {
                if( i != N-1 ) b.append(" ");
                b.append( A[i] );
            }
            for (int i = 0; i < N-1; i = i+2) {
                b.append(" ");
                b.append(A[i]);
            }

        } else {
            // 3(2) 1(0) 2(1)
            for (int i = N-1; i >= 0; i = i-2) {
                if( i != N-1 ) b.append(" ");
                b.append(A[i]);
            }
            for (int i = 1; i < N-1; i = i+2) {
                b.append(" ");
                b.append(A[i]);
            }
        }
        return b.toString();
    }
}
