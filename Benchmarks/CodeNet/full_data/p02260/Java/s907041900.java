import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n, i, count;
        n = cin.nextInt();
        int[] A = new int[n];
        for (i = 0; i < n; i++) {
            A[i] = cin.nextInt();
        }
        
        count = sectionSort(A, n);
        
        for (i = 0; i < n - 1; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println(A[i] + "\n" + count);
    }
    
    static int sectionSort(int[] A, int n) {
        int i, j, min, count = 0;
        for (i = 0; i < n; i++) {
            min = i;
            for (j = i; j < n; j++) {
                if (A[j] < A[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = A[i];
                A[i] = A[min];
                A[min] = temp;
                count++;
            }
        }
        return count;
    }
}
