import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main {
    private static long inversions = 0;

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner s = new Scanner(System.in);
        int arraySize = s.nextInt();
        int[] A = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            A[i] = s.nextInt();
        }

        mergeSort(A, 0, A.length);
        System.out.println(inversions);
    }

    public static void mergeSort(int[] A, int left, int right) {
        if (left + 1 >= right) {
            return;
        }
        int mid = (right + left) / 2;
        mergeSort(A, left, mid);
        mergeSort(A, mid, right);
        merge(A, left, mid, right);
    }

    public static void merge(int[] A, int left, int mid, int right) {

        int n1 = mid - left;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = A[left + i];
        }
        for (int i = 0; i < n2; i++) {
            R[i] = A[mid + i];
        }

        int i = 0;
        int j = 0;

        for (int k = left; k < right; k++) {
            if (j >= n2) {
                A[k] = L[i];
                i = i + 1;
                continue;
            }
            if (i >= n1) {
                A[k] = R[j];
                inversions += L.length - i;
                j = j + 1;
                continue;
            }
            if (L[i] <= R[j]) {
                A[k] = L[i];
                i = i + 1;
            } else {
                A[k] = R[j];
                inversions += L.length - i;
                j = j + 1;
            }
        }
    }
}

