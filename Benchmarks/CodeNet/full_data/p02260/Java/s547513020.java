import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a[] = new int[n];

        for (int i=0; i<n; ++i) {
            a[i] = sc.nextInt();
        }

        int counter = selectionSort(a, n);
        for (int i=0; i<n-1; ++i) {
            System.out.print(a[i] + " ");
        }
        System.out.println(a[n-1] + "\n" + counter);

        sc.close();
    }

    public static int selectionSort(int a[], int n) {
        int counter = 0;
        int min = 0;
        for (int i=0; i<n; ++i) {
            min = i;
            for (int j=i; j<n; ++j) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            if (i != min) {
                int tmp = a[i];
                a[i] = a[min];
                a[min] = tmp;
                counter += 1;
            }
        }
        return counter;
    }
}
