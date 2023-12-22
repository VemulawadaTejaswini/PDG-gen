import java.util.Scanner;

public class Main {
    public static int selection_sort(int a[], int n) {
        int cnt = 0;
        for (int i = 0; i < n - 1; i++) {
            int min = a[i];
            int minflag = i;
            for (int j = i + 1; j < n; j++) {
                if (min > a[j]) {
                    min = a[j];
                    minflag = j;
                }
            }
            if (minflag != i) {
                int temp = a[i];
                a[i] = a[minflag];
                a[minflag] = temp;
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        int ans = selection_sort(a, n);
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]);
            if (i < n - 1)
                System.out.print(" ");
        }
        System.out.println();
        System.out.println(ans);
        sc.close();
    }

}
