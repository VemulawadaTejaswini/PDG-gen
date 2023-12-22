import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    int parseInt(String s) {
        char[] ca = s.toCharArray();
        int ret = 0;
        int k = 1;
        for (int i = ca.length - 1; i >= 0; i--) {
            int x = (int) (ca[i] - '0');
            ret += (x*k);
            k *= 10;
        }
        return ret;
    }
    void printArray(int[] a) {
        StringBuilder sb = new StringBuilder();
        sb.append(a[0]);
        System.out.print(a[0]);
        for (int i = 1; i < a.length; i++) {
            sb.append(" ");
            sb.append(a[i]);
            //System.out.print(" " + a[i]);
        }
        System.out.println(sb);
    }
 void run() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        String line = null;
        try {
            n = Integer.parseInt(br.readLine());
            line = br.readLine();
        } catch (Exception e) {
            System.exit(-1);
        }
        String[] sa = line.split(" ");
        final int SIZE = 10001;
        int[] A = new int[n];
        int[] B = new int[n];
        int[] C = new int[SIZE];
        if (sa.length != n) System.out.println("error");
        System.out.println("Fase1");
        for (int i = 0; i < n; i++) {
            int x = parseInt(sa[i]);
            A[i] = x;
            C[x]++;
        }
        System.out.println("Fase2");
        for (int i = 1; i < SIZE; i++) {
            C[i] = C[i] + C[i-1];
        }
        System.out.println("Fase3");
        for (int i = n-1; i>=0; i--) {
            B[C[A[i]]-1] = A[i];
            C[A[i]]--;
        }
        System.out.println("Fase1");
        printArray(B);
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
