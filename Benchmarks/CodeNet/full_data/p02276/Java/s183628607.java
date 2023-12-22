
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

        int pivot = partition(A, 0, n - 1);

        for (int i = 0; i < n; i++) {
            if (i != 0) {
                System.out.print(" ");
            }
            if (i == pivot) {
                System.out.print("[" + A[i] + "]");
            } else {
                System.out.print(A[i]);
            }
        }
        
        System.out.println();
    }

    static int partition(int[] A, int p, int r) {
        int i = p, j = p;
        int x = A[r];

        while (j < r) {
            if (A[j] <= x) {
                int y = A[i];
                A[i] = A[j];
                A[j] = y;
                i++;
                j++;
            } else {
                j++;
            }
        }
        int y = A[r];
        A[r] = A[i];
        A[i] = y;
        return i;
    }
}

