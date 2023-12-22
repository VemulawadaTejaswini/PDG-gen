import java.util.*;

public class Main {
    public static void main(String[] args) {
        int total;

        Scanner inp = new Scanner(System.in);
        total = inp.nextInt();

        int[] a = new int[total];

        for (int k = 0; k < total; k++) {
            a[k] = inp.nextInt();
        }

        for (int l = 0; l < total; l++) {
            if (l == 0) {
                System.out.printf("%d", a[l]);
            } else {
                System.out.printf(" %d", a[l]);
            }
        }

        System.out.printf("\n");

        for (int i = 1; i <= a.length-1; i++) {
            int key = a[i];
            /* insert A[i] into the sorted sequence A[0,...,j-1] */
            int j = i - 1;
            while (j >= 0 && a[j] > key) {
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = key;

            for (int l = 0; l < total; l++) {
                if (l == 0) {
                    System.out.printf("%d", a[l]);
                } else {
                    System.out.printf(" %d", a[l]);
                }
            }

            System.out.printf("\n");
        }
    }
}

