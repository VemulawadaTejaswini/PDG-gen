import java.util.*;
import java.io.*;
import java.lang.*;
 
public class Main {
    static final int INF = 1000000000;         
    static int cmps = 0;
     
    public static void main(String[] args) throws Exception {                
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] s = new int[n];
        for (int i = 0; i < n; ++i) s[i] = input.nextInt();
        mergeSort(s, 0, n);
        System.out.print(s[0]);
        for (int i = 1; i < n; ++i) System.out.print(" " + s[i]);
        System.out.println("");
        System.out.println(cmps);
    }              
     
    static void mergeSort(int[] A, int left, int right) {
        if (left + 1 < right) {
            int mid = (left + right) / 2;
            mergeSort(A, left, mid);
            mergeSort(A, mid, right);
            merge(A, left, mid, right);
        }
    }
     
    static void merge(int[] A, int left, int mid, int right) {
        int n1 = mid - left;
        int n2 = right - mid;
        int[] L = new int[n1 + 1];
        int[] R = new int[n2 + 1];
        for (int i = 0; i < n1; ++i) L[i] = A[left + i];
        for (int i = 0; i < n2; ++i) R[i] = A[mid + i];
        L[n1] = R[n2] = INF;
        int i, k;
        i = k = 0;
        for (int t = left; t < right; ++t) {
            if (L[i] < R[k]) {
                A[t] = L[i++];
                ++cmps;
            } else {
                A[t] = R[k++];
                ++cmps;
            }
        }
    }
}