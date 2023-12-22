import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int swap = 0;
        for (int i = 0; i < n-1; i++) {
            int minj = i;
            for (int j = i+1; j < n; j++) {
                if (a[j] < a[minj])
                    minj = j;
            }
            if (minj != i) {
                int tmp = a[i];
                a[i] = a[minj];
                a[minj] = tmp;
                swap++;
            }
        }
        for (int i = 0; i < n; i++) {
            // System.out.print(a[i]+" "); // AOJ doesn't allow extra blanks.
            if (i > 0)
                System.out.print(' ');
            System.out.print(a[i]);
        }
        System.out.println("");
        System.out.println(swap);
    }
}
