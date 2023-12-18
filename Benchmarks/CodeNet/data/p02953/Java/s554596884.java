

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextInt();
        long[] A = new long[(int)N];
        long[] B = new long[(int)N+1];

        for(int i = 0; i < N; i++) A[i] = sc.nextInt();
        for(int i = 0; i < N-1; i++) {
            B[i+1] = A[i+1] - A[i];
        }

        long res = 0;
        for(int i = 0; i < N+1; i++) {
            if(B[i] < 0) {
                res += B[i];
            }
        }
        if(res < -1) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}
