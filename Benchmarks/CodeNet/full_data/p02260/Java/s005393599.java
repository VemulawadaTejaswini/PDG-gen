import java.util.*;

public class Main {
    static void swap(int[] A, int i, int j) {
        int tmp = A[i];
        A[i] = A[j];
        A[j] = tmp;
    }

    static int selectionSort(int[] A, int N) {
        int count = 0;
        for(int i = 0; i < N; i++) {
            int minj = i;
            for(int j = i; j < N; j++) {
                if(A[j] < A[minj]) minj = j;
            }
            if(i != minj) {
                swap(A, i, minj);
                count++;
            }
        } 
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) a[i] = sc.nextInt();

        int c = selectionSort(a, n);

        System.out.print(a[0]);
        for(int i = 1; i < n; i++) System.out.print(" " + a[i]);
        System.out.println();
        System.out.println(c);
    }
}
