import java.util.Scanner;
import java.util.StringJoiner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        System.out.println( solve(N, T, A) );
    }

    private static int solve(int N, int T, int[] A) {
        int[] saleAt = new int[N];
        saleAt[N-1] = -1;
        int maxIndex = N-1;
        int maxDiff = 0;
        for (int i = N-2; i >=0 ; i--) {
            if( A[i] > A[maxIndex] ) {
                maxIndex = i;
                saleAt[i] = -1;
            } else {
                saleAt[i] = maxIndex;
                maxDiff = Math.max(A[maxIndex] -A[i], maxDiff);
            }
        }

        int ans = 0;
        for (int i = 0; i < N; i++) {
            if( saleAt[i] != -1 && A[saleAt[i]] - A[i] == maxDiff ) ans++;
        }

        return ans;
    }

    private static void show(int[] array) {
        StringJoiner j = new StringJoiner(" ");
        for (int i : array) {
            j.add(String.valueOf(i));
        }
        System.err.println( j.toString() );
    }
}