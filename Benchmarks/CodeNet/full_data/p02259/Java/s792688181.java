import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner cin = new  Scanner(System.in);
        int n, i;
        n = cin.nextInt();
        int[] A = new int[n];
        for (i = 0; i < n; i++) {
            A[i] = cin.nextInt();
        }
        int count = BubbleSort(A, n);
        for (i = 0; i < n - 1; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println(A[i] + "\n" + count);
    }
    static int BubbleSort(int[] A, int n) {
        int i = 0, j, count = 0;
        boolean flag = true;
        while (flag) {
            flag = false;
            for (j = n - 1; j > i; j--) {
                if (A[j] < A[j - 1]) {
                    int temp = A[j];
                    A[j] = A[j - 1];
                    A[j - 1] = temp;
                    flag = true;
                    count++;
                }
            }
            i++;
        }
        return count;
    }
}
