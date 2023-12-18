import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int[] a = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            a[i] = l + i;
            sum += a[i];
        }

        if (a[0] < 0 && a[n - 1] > 0) System.out.print(sum);
        else if (a[0] >= 0) System.out.print(sum - a[0]);
        else System.out.print(sum - a[n - 1]);
    }
}