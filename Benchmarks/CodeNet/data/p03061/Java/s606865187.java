import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    static int N;
    static int A[];
    static int L[];
    static int R[];
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        sc.close();

        L = new int[N];
        R = new int[N];
        for (int i = 0; i < N; i++) {
            L[i] = L_calc(i);
            R[N - i - 1] = R_calc(N - i - 1);
        }
        
        int temp_max_gcd = 0;
        for (int i = 0; i < N; i++) {
            if (temp_max_gcd < gcd(L[i], R[i])) {
                temp_max_gcd = gcd(L[i], R[i]);
            }
        }
        System.out.println(temp_max_gcd);
    }

    public static int L_calc(int i) {
        if (i == 0) {
            return 0;
        }
        return gcd(L[i - 1], A[i - 1]);
    }

    public static int R_calc(int i) {
        if(i == N - 1) {
            return 0;
        }
        return gcd(R[i + 1], A[i + 1]);
    }

    public static int gcd(int x, int y) {
        if (x == 0){
            return y;
        } else if (y == 0) {
            return x;
        }
        int a = Math.max(x, y);
        int b = Math.min(x, y);
        while (a % b != 0) {
            int extra = a % b;
            a = b;
            b = extra;
        }
        return b;
    }
}
