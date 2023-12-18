import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int N = sc.nextInt();
        int[] L = new int[N];
        for (int i = 0; i < N; i++) {
            L[i] = sc.nextInt();
        }
        sc.close();

        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    if (isTriangle(L[i], L[j], L[k])) {
                        count ++;
                    }
                }
            }
        }
        out.printf("%d\n", count);
        out.flush();
    }
    static boolean isTriangle(int a, int b, int c) {
        if ((a < b + c && b < c + a && c < a + b)) {
            return true;
        }
        return false;
    }
}
