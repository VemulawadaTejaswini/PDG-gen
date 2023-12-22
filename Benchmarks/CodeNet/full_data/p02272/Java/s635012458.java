
import java.util.Scanner;

public class Main {
    static int n;
    static int[] A;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        A = new int [n];
        for (int i = 0; i < n; i++) {
            A[i] = s.nextInt();
        }
        int cmp = mergeSort(A, 0, n);

        for (int i = 0; i < n; i++) {
            if (i != 0) {
                System.out.print(" ");
            }
            System.out.print(A[i]);
        }
        System.out.println();
        System.out.println(cmp);
    }

    static int merge(int[] B, int left, int middle, int right) {
        int [] L, R;
        L = new int [middle - left + 1];
        R = new int [right - middle + 1];

        for (int k = 0; k < middle - left; k++) {
            L[k] = A[left + k];
        }

        for (int k = 0; k < right - middle; k++) {
            R[k] = A[middle + k];
        }

        L[middle - left] = Integer.MAX_VALUE;
        R[right - middle]  = Integer.MAX_VALUE;

        int i = 0, j = 0, k = 0;
        while (i < middle - left || j < right - middle) {
            if (L[i] < R[j]) {
                A[left + k] = L[i];
                i++;
            } else {
                A[left + k] = R[j];
                j++;
            }
            k++;
        }
        return k;
    }

    static int mergeSort(int []B, int left, int right) {
        if (left + 1 == right) {
            return 0;
        }
        int middle = (left + right) / 2;

        int s = mergeSort(B, left, middle);
        int t = mergeSort(B, middle, right);
        int cmp = merge(B, left, middle, right);
        return cmp + s + t;
    }
}

