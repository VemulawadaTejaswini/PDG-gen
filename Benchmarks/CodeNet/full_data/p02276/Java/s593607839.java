import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int total;

        Scanner inp = new Scanner(System.in);
        total = inp.nextInt();

        int a[] = new int[total];

        for (int k = 0; k < total; k++) {
            a[k] = inp.nextInt();
        }

        int part = partition(a, 0, total-1);

        StringBuilder s = new StringBuilder();
        for (int i = 0; i < total; i++) {
            if (part == i) {
                s.append("[" + a[i] + "]");
            } else {
                s.append(a[i]);
            }

            if (i != total-1) {
                s.append(" ");
            }
        }

        System.out.print(s + "\n");
    }

    public static int partition(int[] a, int p, int r) {
        int x = a[r];
        int i = p-1;
        for (int j = p; j < r; j++) {
            if (a[j] < x) {
                i = i+1;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }

        int temp = a[i+1];
        a[i+1] = a[r];
        a[r] = temp;

        return i+1;
    }
}

