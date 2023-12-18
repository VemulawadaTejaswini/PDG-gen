import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = getInt();
        int[] A = new int[n];
        int[] B = new int[n];
        int[] C = new int[n];
        long ans = 0;
        for(int i = 0; i < n; i++) A[i] = getInt();
        for(int i = 0; i < n; i++) B[i] = getInt();
        for(int i = 0; i < n; i++) C[i] = getInt();
        Arrays.sort(A);
        Arrays.sort(C);
        for(int i = 0; i < n; i++) {
            int a;
            int b;
            int l = 0;
            int u = n-1;
            int m = 0;
            while(l <= u) {
                m = (l + u) / 2;
                if(B[i] == A[m]) break;
                else if(A[m] < B[i]) l = m + 1;
                else u = m - 1;
            }
            if(B[i] == A[m] && m > 0) a = m;
            else if(l > n-1) a = n;
            else if(l > u && u >= 0) a = u+1;
            else continue;

            l = 0;
            u = n - 1;
            m = 0;
            while(l <= u) {
                m = (l + u) / 2;
                if(C[m] == B[i]) break;
                else if(C[m] < B[i]) l = m + 1;
                else u = m - 1;
            }
            if(C[m] == B[i]) b = n - m - 1;
            else if(u < 0) b = n;
            else if(l > u && l <= n-1) b = n - l;
            else continue;
            ans = ans + a*b;
        }
        System.out.println(ans);
    }
    static int getInt() {
        return Integer.parseInt(sc.next());
    }
}