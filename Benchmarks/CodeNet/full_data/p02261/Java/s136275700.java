import java.util.Scanner;

public class Main {
    public static void bubble_sort(String[] a, int n) {
        int flag = 0; // 完了した場所
        while (flag < n - 1) {
            for (int i = n - 2; i >= 0; i--) {
                if (a[i].charAt(1) - '0' > a[i + 1].charAt(1) - '0') {
                    String temp = a[i + 1];
                    a[i + 1] = a[i];
                    a[i] = temp;
                }

            }
            flag++;
        }
    }

    public static void selection_sort(String a[], int n) {
        for (int i = 0; i < n - 1; i++) {
            int min = a[i].charAt(1) - '0';
            int minflag = i;
            for (int j = i + 1; j < n; j++) {
                if (min > a[j].charAt(1) - '0') {
                    min = a[j].charAt(1) - '0';
                    minflag = j;
                }
            }
            if (minflag != i) {
                String temp = a[i];
                a[i] = a[minflag];
                a[minflag] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String a[] = new String[n];
        String b[] = new String[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.next();
            b[i] = a[i];
        }
        bubble_sort(a, n);
        selection_sort(b, n);
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]);
            if (i < n - 1)
                System.out.print(" ");
        }
        System.out.println();
        System.out.println("Stable");
        Boolean ok = true;
        for (int i = 0; i < n; i++) {
            if (a[i] != b[i])
                ok = false;
            System.out.print(b[i]);
            if (i < n - 1)
                System.out.print(" ");
        }
        System.out.println();
        if (ok)
            System.out.println("Stable");
        else
            System.out.println("Not stable");
        sc.close();

    }

}
