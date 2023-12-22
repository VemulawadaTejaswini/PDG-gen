import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a[] = new int[n];

        for (int i=0; i<n; ++i) {
            a[i] = sc.nextInt();
        }

        int counter = bubbleSort(a, n);
        for (int i=0; i<n-1; ++i) {
            System.out.print(a[i] + " ");
        }
        System.out.println(a[n-1] + "\n" + counter);
    }

    public static int bubbleSort(int a[], int n) {
        boolean flag = true;
        int counter = 0;
        while (flag) {
            flag = false;
            for (int i=n-1; i>0; --i) {
                if (a[i] < a[i-1]) {
                    int tmp = a[i];
                    a[i] = a[i-1];
                    a[i-1] = tmp;
                    flag = true;
                    counter += 1;
                }
            }
        }
        return counter;
    }
}
