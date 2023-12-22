
import java.util.*;

/**
 * B
 */
public class B {

    static final int INF = 500000;
    static int count = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] S = new int[n];

        for (int i = 0; i < n; i++) {
            S[i] = sc.nextInt();
        }

        mergeSort(S, 0, n);

        System.out.print(S[0]);

        for (int i = 1; i < n; i++) {

            System.out.print(" " + S[i]);

            if (i == n - 1) {
                System.out.println();
                System.out.println(count);
            }
        }

        sc.close();

    }

    static void mergeSort(int[] A, int left, int right) {

        if (left+1 < right) {
            int mid = (left+right)/2;
            mergeSort(A, left, mid);
            mergeSort(A, mid, right);
            merge(A, left, mid, right);
        }

    }

    static void merge(int[] A, int left, int mid, int right) {

        int n1 = mid-left;
        int n2 = right-mid;
        int[] L = new int[n1+1];
        int[] R = new int[n2+1];

        for (int i=0; i<n1; i++) {
            L[i] = A[left+i];
        }

        for (int i=0; i<n2; i++) {
            R[i] = A[mid+i];
        }

        L[n1] = INF;
        R[n2] = INF;

        int i = 0;
        int j = 0;

        for (int k = left; k<right; k++) {

            count++;

            if (L[i] <= R[j]) {
                A[k] = L[i];
                i++;
            } else {
                A[k] = R[j];
                j++;
            }

        }
    }

}
