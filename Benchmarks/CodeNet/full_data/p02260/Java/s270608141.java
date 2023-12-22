import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder bd = new StringBuilder();

        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i=0; i<N; i++) {
            A[i] = sc.nextInt();
        }

        int counter = selectionSort(A, N);
        for (int i=0; i<N-1; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println(A[N-1]);
        System.out.println(counter);
    }

    public static int selectionSort(int[] A, int N) {
        int minj = 0;
        int count = 0;
        for (int i=0; i<N; i++) {
            minj = i;
            for (int j=i; j<N; j++) {
                if (A[j] < A[minj])
                    minj = j;
            }
            if (i != minj) {
                int t = A[i];
                A[i] = A[minj];
                A[minj] = t;
                count++;
            }
        }
        return count;
    }


    public static int bubbleSort(int[] A, int N) {
        int flag = 1;
        int count = 0;
        while (flag == 1) {
            flag = 0;
            for (int i=N-1; i>=1; i--) {
                if (A[i] < A[i-1]) {
                    int t = A[i];
                    A[i] = A[i-1];
                    A[i-1] = t;
                    flag = 1;
                    count++;
                }
            }
        }
        return count;
    }
}
