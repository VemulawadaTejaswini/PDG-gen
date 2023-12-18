import java.util.*;
public class Main {
    static int[] reverse(int a[]) { 
        final int n = a.length;
        int[] b = new int[n]; 
        int j = n; 
        for (int i = 0; i < n; i++) {
            b[j - 1] = a[i]; 
            j = j - 1; 
        }
        return b;
    } 
    static void shift(int a[], int val) { 
        final int n = a.length;
        for (int i = 1; i < n; i++) {
            a[i - 1] = a[i]; 
        }
        a[n-1] = val;
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), C = sc.nextInt();
        int[] X = new int[N+2]; X[0] = 0;
        int[] V = new int[N+1]; V[0] = 0;

        for (int n = 1; n <= N; n++) {
            X[n] = sc.nextInt(); 
            V[n] = sc.nextInt();
        }
        X[N+1] = C;
//時計回り
        int[] L = new int[N+1]; L[0] = 0;
        for (int n = 1; n <= N; n++) {
            L[n] = L[n-1] + V[n] - (X[n] - X[n-1]);
        }
        int[] R = new int[N+1]; R[0] = 0;
        for (int n = N-1; n >= 0; n--) {
            R[n] = R[n+1] + V[n+1] - (X[n+2] - X[n+1]);
        }
        int ans = Integer.MIN_VALUE;
        for (int n = 0; n <= N; n++) {
            ans = Math.max(ans, L[n]);
            for (int m = n; m < N; m++) {
                int s = L[n] - X[n] + R[m];
                ans = Math.max(ans, s);
            }
        }
//反時計回り
        for (int n = 0; n < X.length; n++) {
            X[n] = C - X[n];
        }
        X = reverse(X);
        shift(V, 0); 
        V = reverse(V);
        L[0] = 0;
        for (int n = 1; n <= N; n++) {
            L[n] = L[n-1] + V[n] - (X[n] - X[n-1]);
        }
        R[N] = 0;
        for (int n = N-1; n >= 0; n--) {
            R[n] = R[n+1] + V[n+1] - (X[n+2] - X[n+1]);
        }
        for (int n = 0; n <= N; n++) {
            ans = Math.max(ans, L[n]);
            for (int m = n; m < N; m++) {
                int s = L[n] - X[n] + R[m];
                ans = Math.max(ans, s);
            }
        }
        System.out.println(ans);
        sc.close();
        }
}