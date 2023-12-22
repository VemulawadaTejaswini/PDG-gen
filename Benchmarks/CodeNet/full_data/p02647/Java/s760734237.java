import java.util.*;

public class Main {
    static int gcd (int x,int y) {return y>0?gcd(y,x%y):x;}
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int A[] = new int[N+1];
        for(int i=1; i<=N; i++) {
            A[i] = sc.nextInt();
        }

        for(int i=1; i<=Math.min(K, 42); i++) {
            int T[] = new int[N+2];
            for(int k=1; k<=N; k++) {
                int leftIndex = Math.max(1, k-A[k]);
                int rightIndex = Math.min(N+1, k+A[k]+1);
                T[leftIndex] += 1;
                T[rightIndex] -= 1;
            }
            int B[] = new int[N+1];
            for(int k=1; k<=N; k++) {
                B[k] = B[k-1] + T[k];
            }
            A = B;
        }
        dump(A, N);
    }

    static void dump(int[] array, int size) {
        for(int i=1; i<=size; i++) {
            if(i!=1) System.out.print(" ");
            System.out.print(String.format("%d", array[i]));
        }
        System.out.println();
    }
}
