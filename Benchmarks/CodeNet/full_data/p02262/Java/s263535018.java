import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = sc.nextInt();
        int[] A = new int[n];

        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        shellSort(A, n);
    }

    static int insertionSort(int[] A, int n, int g) {
        int cnt = 0;
        for (int i = g; i < n; i++) {
            int v = A[i];
            int j = i - g;
            while (j >= 0 && A[j] > v) {
                A[j+g] = A[j];
                j = j - g;
                cnt++;
            }
            A[j+g] = v;
        }

        return cnt;
    }

    static void shellSort(int[] A, int n) {
        PrintWriter pw = new PrintWriter(System.out);

        long cnt = 0;
        int m = 1;
        for (int i = n-1; i > 2; i /= 2) {
            m++;
            pw.print(i + " ");
            cnt += insertionSort(A, n, i);
        }
        pw.println(1);
        cnt += insertionSort(A, n, 1);

        System.out.println(m);
        pw.flush();

        pw.println(cnt);
        for (int i = 0; i < n; i++) {
            pw.println(A[i]);
        }

        pw.flush();
    }
}
