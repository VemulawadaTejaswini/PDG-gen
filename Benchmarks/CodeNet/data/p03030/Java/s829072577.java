import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static String[] S;
    static int[] I;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        S = new String[n];
        int[] P = new int[n];
        I = new int[n];
        for(int i = 0; i < n; i++) {
            S[i] = sc.next();
            P[i] = sc.nextInt();
            I[i] = i + 1;
        }
        mergeSort(P, 0, n-1);
        Arrays.stream(I).forEach(System.out::println);
    }
    public static void mergeSort(int[] A, int p, int r) {
        int q = (p + r) / 2;
        if(p < q) {
            mergeSort(A, p, q);
            mergeSort(A, q + 1, r);
        }
        merge(A, p, q, r);
    }

    private static void merge(int[] A, int p, int q, int r) {
        int[] L = new int[q-p+2];
        int[] R = new int[r-q+1];
        int[] LI = new int[q-p+2];
        int[] RI = new int[r-q+1];
        String[] LS = new String[q - p + 2];
        String[] RS = new String[r - q + 1];
        for(int i = 0; i < L.length - 1; i++) {
            L[i] = A[p + i];
            LS[i] = S[p + i];
            LI[i] = I[p + i];
        }
        for(int i = 0; i < R.length - 1; i++) {
            R[i] = A[q + i + 1];
            RS[i] = S[q + i + 1];
            RI[i] = I[q + i + 1];
        }
        L[q-p+1] = R[r-q] = LI[q-p+1] = RI[r-q] =  Integer.MAX_VALUE;
        LS[q-p+1] = RS[r-q] = "zzzzzzzzzzzzzzzzz";
        int i = 0;
        int j = 0;
        for(int k = p; k <= r; k++) {
            if(LS[i].compareTo(RS[j]) < 0) {
                I[k] = LI[i];
                S[k] = LS[i];
                A[k] = L[i++];
            } else if(LS[i].equals(RS[j])) {
                if(L[i] >= R[j]) {
                    I[k] = LI[i];
                    S[k] = LS[i];
                    A[k] = L[i++];
                } else {
                    I[k] = RI[j];
                    S[k] = RS[j];
                    A[k] = R[j++];
                }
            } else {
                I[k] = RI[j];
                S[k] = RS[j];
                A[k] = R[j++];
            }
        }
    }
}
