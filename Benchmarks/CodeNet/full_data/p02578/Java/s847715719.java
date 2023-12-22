import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        int b[] = new int[n];
        b[0] = 0;
        for (int i = 1; i < n; i++) {
            if (a[i - 1] <= a[i]) {
                b[i] = 0;
            } else {
                b[i] = a[i - 1] - a[i];
            }
            a[i] += b[i];
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += b[i];
        }
        System.out.println(sum);
    }
}
