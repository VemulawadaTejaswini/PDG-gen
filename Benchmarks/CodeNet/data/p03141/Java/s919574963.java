import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int[] A = new int[N];
        int[] B = new int[N];
        int[] C = new int[N];
        int[] D = new int[N];
        for (int i=0; i<N; i++) {
            A[i] = Integer.parseInt(sc.next());
            B[i] = Integer.parseInt(sc.next());
            C[i] = A[i]-B[i];
            D[i] = 1;
        }
        sc.close();
        
        boolean ab = true;
        long sum = 0;
        int nc = N;
        while (nc>0) {
            int j = addsum(A, B, C, D, ab, N);
            if (ab) {
                sum += A[j];
                //System.out.println(j + "+" + A[j]);
            } else {
                sum -= B[j];
                //System.out.println(j + "-" + B[j]);
            }
            D[j] = 0;
            ab = !ab;
            nc--;
        }
        System.out.println(sum);
    }
    
    private static int addsum(int A[], int B[], int C[], int D[], boolean ab, int N) {
        int tempab = 0;
        int tempc = 0;
        int j = 0;
        for (int i=0; i<N; i++) {
            if (D[i]>0) {
                j = i;
                if (ab) {
                    tempc = C[i];
                } else {
                    tempc = -C[i];
                }
                break;
            }
        }
        for (int i=0; i<N; i++) {
            if (ab && D[i]>0 && tempc >= C[i]) {
                tempc = C[i];
                if (tempab<=A[i]) {
                    tempab = A[i];
                    j = i;
                }
            } else if (!ab && D[i]>0 && tempc <= -C[i]) {
                tempc = -C[i];
                if (tempab<=B[i]) {
                    tempab = B[i];
                    j = i;
                }
            }
        }
        return j;
    }
}
